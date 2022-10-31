fun main() {
    val vectorInicial = IntArray(30_000) { (0..1000).random() }
    var timeIni = 0L
    var timeFin = 0L

    fun linearSearch(array: IntArray, value: Int): Int {
        for (i in array.indices) {
            if (array[i] == value) {
                return i
            }
        }
        return -1
    }

    val elementoParaBuscar = vectorInicial.random()

    timeIni = System.nanoTime()
    linearSearch(vectorInicial, elementoParaBuscar)
    timeFin = System.nanoTime()
    println("Tiempo búsqueda lineal: ${timeFin - timeIni} ns")
}