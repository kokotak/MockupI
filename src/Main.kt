fun main() {
    var hasilAkhir = 0
    println("***    Masukkan jumlah pemain  : **")
    var inputan = readLine()
    var jumlahPemain = inputan!!.toInt()
    for (i in 1..jumlahPemain) {
        println("***    Masukkan nama : **")
        var playersName = readLine()
        for (i in 0..4) {
            val mataDadu = listOf(1, 2, 3, 4, 5, 6)
            var hasilDadu = mataDadu.random()
            when (hasilDadu) {
                1 -> {
                    hasilAkhir += 5
                }
                2 -> {
                    hasilAkhir -= 3
                }
                3 -> {
                    hasilAkhir += 5
                }
                4 -> {
                    hasilAkhir -= 3
                }
                5 -> {
                    hasilAkhir += 5
                }
                6 -> {
                    hasilAkhir -= 3
                }
            }
            println(hasilDadu)
        }
        print(" Hasil Akhir kamu adalah = $hasilAkhir")
    }

}