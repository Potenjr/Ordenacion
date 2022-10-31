fun main() {
    val vectorInicial = IntArray(100_000) { (0..1000000000).random() }
    var tiempoIni = 0L
    var tiempoFin = 0L

    fun shellSort(array: IntArray) {
        var h = 1
        while (h < array.size / 3) {
            h = 3 * h + 1
        }
        while (h >= 1) {
            for (i in h until array.size) {
                var j = i
                while (j >= h && array[j] < array[j - h]) {
                    val aux = array[j]
                    array[j] = array[j - h]
                    array[j - h] = aux
                    j -= h
                }
            }
            h /= 3
        }
    }

    val vectorShell = vectorInicial
    tiempoIni = System.currentTimeMillis()
    shellSort(vectorShell)
    tiempoFin = System.currentTimeMillis()
    println("Tiempo shell: ${tiempoFin - tiempoIni} ms")
}




