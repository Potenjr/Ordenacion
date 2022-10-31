fun main() {
    val vectorInicial = IntArray(100_000) { (0..1000000000).random() }
    var timeIni = 0L
    var timeFin = 0L

    fun binarySearch(array: IntArray, value: Int, left: Int, right: Int): Int {
        if (left > right) {
            return -1
        }
        val middle = (left + right) / 2
        return when {
            array[middle] == value -> middle
            array[middle] > value -> binarySearch(array, value, left, middle - 1)
            else -> binarySearch(array, value, middle + 1, right)
        }
    }
    val elementoParaBuscar = vectorInicial.random()
    val vectorOrdenado = vectorInicial.sortedArray()
    timeIni = System.nanoTime()
    ordenacion.binarySearch(vectorOrdenado, elementoParaBuscar)
    timeFin = System.nanoTime()
    println("Tiempo búsqueda binaria: ${timeFin - timeIni} ns")
}




