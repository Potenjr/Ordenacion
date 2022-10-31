fun main() {
    val vectorInicial = IntArray(20_000) { (0..1000000000).random() }
    var timeIn = 0L
    var timeFn = 0L
    fun pivot(array: IntArray, left: Int, right: Int): Int {
        var i = left
        var j = right
        var pivot = array[left]
        while (i < j) {
            while (array[i] <= pivot && i < j) {
                i++
            }
            while (array[j] > pivot) {
                j--
            }
            if (i < j) {
                val aux = array[i]
                array[i] = array[j]
                array[j] = aux
            }
        }
        array[left] = array[j]
        array[j] = pivot
        return j
    }

    fun quicksort(array: IntArray, left: Int, right: Int) {
        val piv: Int
        if (left < right) {
            piv = pivot(array, left, right)
            quicksort(array, left, piv - 1)
            quicksort(array, piv + 1, right)
        }
    }

    val vectorQuick = vectorInicial.clone()
    timeIn = System.currentTimeMillis()
    ordenacion.quickSort(vectorQuick)
    timeFn = System.currentTimeMillis()
    println("Tiempo quick: ${timeFn - timeIn} ms")
}

