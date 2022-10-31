fun main() {
    val vectorInicial = IntArray(100_000) { (0..1000000000).random() }
    var timeInicial = 0L
    var timeFinal = 0L

    fun selectionSort(array: IntArray) {
        for (i in 0 until array.size - 1) {
            var min = i
            for (j in i + 1 until array.size) {
                if (array[j] < array[min]) {
                    min = j
                }
            }
            val aux = array[i]
            array[i] = array[min]
            array[min] = aux
        }
    }

    val vectorSeleccion = vectorInicial
    timeInicial = System.currentTimeMillis()
    selectionSort(vectorSeleccion)
    timeFinal = System.currentTimeMillis()
    println("Tiempo selección: ${timeFinal - timeInicial} ms")
}