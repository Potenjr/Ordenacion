fun main() {
    val vectorInicial = IntArray(100_000) { (0..1000000000).random() }
    var timeIni = 0L
    var timeFin = 0L

    // burbuja
    fun bubbleSort(vector: IntArray) {
        for (i in 0 until vector.size - 1) {
            for (j in 0 until vector.size - 1 - i) {
                if (vector[j] > vector[j + 1]) {
                    val aux = vector[j]
                    vector[j] = vector[j + 1]
                    vector[j + 1] = aux
                }
            }
        }
    }

    val vectorBurbuja = vectorInicial
    timeIni = System.currentTimeMillis()
    bubbleSort(vectorBurbuja)
    timeFin = System.currentTimeMillis()
    println("Tiempo burbuja: ${timeFin - timeIni} ms")
}