package UAS

import java.util.*      //mengimport package java.util.* agar bisa menginputkan data


///////////////////////////////////////////////////////BATAS////////////////////////////////////////////////////////////
class Tabungan {
    private var jumlahSaldo = 0

    fun tambahSaldo(a: Int){
        if (a < 0){
            println("Input nominal salah")
        }else{
            jumlahSaldo += a
            println("Saldo berhasil ditambah")
        }
    }

    internal fun tarikSaldo(a: Int){
        if (a> jumlahSaldo){
            println("Saldo tidak mencukupi")
        }else{
            jumlahSaldo -=a
            println("Saldo berkurang")
        }
    }
}
open class tinggal {       //Induk Class
    open fun pilih1(name: String, nim: String, jurusan: String, tgllahir: String, masuk1: Int, keluar1: Int ) {}
    open fun pilih2(name: String, nim: String, jurusan: String, tgllahir: String, masuk2: Int, keluar2: Int ) {}
}

open class rumah: tinggal() {   //Polymorpishm Class ke-1
    override fun pilih1(name:String, nim: String, jurusan: String, tgllahir: String, masuk1: Int, keluar1: Int, ) {    //Fungsi class beserta tipe-datanya
        println("\nHalo $name denga2n NIM $nim yang bertanggal lahir $tgllahir." +
                "\nSaat ini anda memiliki total pemasukan sebesar ${masuk1}" +
                "\ndengan total pengeluaran sebesar ${keluar1}" +
                "\nJika selisihkan maka diakhir bulan uang saku anda sebesar ${masuk1-keluar1}")
    }   //Isi Output dari fungsi ucap class rumah
}

open class kost: tinggal() {   //Polymorpishm Class ke-2
    override fun pilih2(name:String, nim: String, jurusan: String, tgllahir: String, masuk2: Int, keluar2: Int, ) {      //Fungsi class beserta tipe-datanya
        println("\nHalo $name dengan NIM $nim yang bertanggal lahir $tgllahir." +
                "\nSaat ini anda memiliki total pemasukan sebesar ${masuk2}, dengan total pengeluaran sebesar ${keluar2}" +
                "\nJika selisihkan maka diakhir bulan uang saku anda sebesar ${masuk2-keluar2}")
    }   //Isi Output dari fungsi ucap class kost
}

var tampung = 0
///////////////////////////////////////////////////////BATAS////////////////////////////////////////////////////////////

fun main() {
    val scan = Scanner(System.`in`)     ///Membuat variabel scan untuk mengambil input dari keyboard.
    var Rumah = rumah()               //Memanggil class rumah
    var Kost = kost()               //Memanggil class kost
    var tabungan = Tabungan()

    println("\n|| SELAMAT DATANG DI APLIKASI WALLET ||\n")
    println("")
    println("\t\tMenu Program")
    println("1. Masukkan Saldo")
    println("2. Hitung Pengeluaran kamu")
    println("3. Cek Saldo")
    print("Masukkan Angka 1-3 : ")
    var angka = scan.nextInt()
    if (angka == 1) {
        var tabungan = Tabungan()
        println("Tambah Saldo : ")
        var tambahSaldo = scan.nextInt()
        tabungan.tambahSaldo(tambahSaldo)
        println("Saldo $tambahSaldo")
        tampung += tambahSaldo
        print("Ulang ? Y/N = ")
        val ulang = scan.next()
        if (ulang == "Y") {
            main()
        } else {
            return
        }

    } else if (angka == 2) {
        println("Di program ini kami akan mencari selisih dari pemasukan dan pengeluaran anda perbulannya,")
        println("jadi anda tidak perlu risau tentang seberapa banyak total pengeluaran anda bulan kemarin")
        println("sehingga anda dapat mengevaluasi total pengeluaran anda pada bulan depan.")
        print("Masukkan Nama : ")
        var name = scan.next()      //Menginputkan Nama User

        print("Masukkan Nim : ")
        var nim = scan.next()       //Menginputkan NIM User

        print("Masukkan Jurusan : ")
        var jurusan = scan.next()       //Menginputkan Jurusan User

        print("Masukkan Tanggal Lahir : ")
        var tgllahir = scan.next()      //Menginputkan Tanggal Lahir User

        println()
        print(
            """Selanjutnya, silahkan pilih tempat tinggal anda sekarang :
1. Saya bertempat tinggal di rumah.
2. Saya ngekost.
Pilih nomor 1 atau 2 : """.trimMargin()
        )
        var pilih = scan.nextInt()          //User memilih kelas mana yang di tempati user sekarang

        println()

        if (pilih == 1) {
            println("(bisa dari uang saku, kerja, dan lain-lain)")
            print("Masukkan Jumlah uang yang ingin anda Hitung : ")
            var masuk1 = scan.nextInt()

            print("Masukkan Biaya Bensin : ")
            var bensin1 = scan.nextInt()

            print("Masukkan Biaya Paket Data Seluler : ")
            var paket1 = scan.nextInt()

            print("Masukkan Biaya Makan : ")
            var makan1 = scan.nextInt()

            print("Masukkan Biaya Lainnya : ")
            var lain1 = scan.nextInt()

            var keluar1 = bensin1 + paket1 + makan1 + lain1

            Rumah.pilih1(name, nim, jurusan, tgllahir, masuk1, keluar1)
            main()

        } else if (pilih == 2) {
            print("Masukkan Jumlah Uang yang ingin Anda hitung : ")
            var masuk2 = scan.nextInt()

            print("\nMasukkan Biaya Bensin : ")
            var bensin2 = scan.nextInt()

            print("Masukkan Biaya Paket Data Seluler : ")
            var paket2 = scan.nextInt()

            print("Masukkan Biaya Makan : ")
            var makan2 = scan.nextInt()

            print("Masukkan Biaya Lainnya : ")
            var lain2 = scan.nextInt()

            var keluar2 = bensin2 + paket2 + makan2 + lain2

            Kost.pilih2(name, nim, jurusan, tgllahir, masuk2, keluar2)
            main()

        } else {
            println("Kode tidak ada")
            println("------------------------------------------")
            main()
        }
    } else if (angka == 3) {1
        var tabungan = Tabungan()
        println("Cek Jumlah Saldo")
        println("Jumlah $tampung")
        main()
    }else{
        print("Pilihan Tidak Tersedia")
        print("Ulang ? Y/N = ")
        val ulang = scan.next()
        if (ulang == "Y"){
            main()
        }else{
            return
        }
    }


}
