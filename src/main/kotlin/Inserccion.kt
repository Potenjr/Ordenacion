fun main() {
    val vectorInicial = IntArray(100_000) { (0..1000000000).random() }
    var tiempoInicial = 0L
    var tiempoFinal = 0L

    fun insertionSort(array: IntArray) {
        for (i in 1 until array.size) {
            var j = i
            while (j > 0 && array[j] < array[j - 1]) {
                val aux = array[j]
                array[j] = array[j - 1]
                array[j - 1] = aux
                j--
            }
        }
    }
    val vectorInsercion = vectorInicial
    tiempoInicial = System.currentTimeMillis()
    insertionSort(vectorInsercion)
    tiempoFinal = System.currentTimeMillis()
    println("Tiempo inserción: ${tiempoFinal - tiempoInicial} ms")
}
