import java.util.*
import kotlin.system.exitProcess

class Tabungan {
    private var jumlahSaldo = 0

    public fun tampilSaldo(){
        println("Jumlah saldo adalah $jumlahSaldo")
    }

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
var tampung = 0
fun main() {
    var read = Scanner(System.`in`)

    println("\tPilih Angka 1-3")
    println("1. Cek jumlahb Saldo")
    println("2. Tambah Saldo")
    println("3. Tarik Saldo")
    print("Masukkan Angka : ")
    var angka = read.nextInt()
    if (angka == 1){

        var tabungan = Tabungan()
        println("Cek Jumlah Saldo")
        println("Jumlah $tampung")
    }else if (angka == 2){
        var tabungan = Tabungan()
        println("Tambah Saldo : ")
        var tambahSaldo = read.nextInt()
        tabungan.tambahSaldo(tambahSaldo)
        println("Saldo $tambahSaldo")
        tampung += tambahSaldo
        print("Ulang ? Y/N = ")
        val ulang = read.next()
        if (ulang == "Y"){
            main()
        }else{
            return
        }
    }else if(angka == 3){
        var tabungan = Tabungan()
        println("Tarik Saldo")
        var tariksaldo = read.nextInt()
        tabungan.tarikSaldo(tariksaldo)
        println("Tarik sebesar $tariksaldo")
        var tampung = 0
        tampung += tariksaldo
    }else{
        println("Pilihan tidak Tersedia")
    }

}