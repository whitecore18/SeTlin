fun main() {
    val numbers = setOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)

    // Task1
    val (even, odd) = splitEvenOdd(numbers)
    println("Четные элементы: $even")
    println("Нечетные элементы: $odd")

    // Task2
    val multipliedSet = multiplyAndFilter(numbers)
    println("Элементы, умноженные на 2 и кратные 5: $multipliedSet")

    // Task3
    val uniqueElements = removeDuplicates(numbers)
    println("Неповторяющиеся элементы: $uniqueElements")

    // Task4
    val array = intArrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    val resultArray = moveZerosToEnd(array)
    println("Массив с нулями в конце: ${resultArray.joinToString(", ")}")
}

fun splitEvenOdd(numbers: Set<Int>): Pair<List<Int>, List<Int>> {
    val even = numbers.filter { it % 2 == 0 }
    val odd = numbers.filter { it % 2 != 0 }
    return Pair(even, odd)
}

fun multiplyAndFilter(numbers: Set<Int>): Set<Int> {
    return numbers.map { it * 2 }
        .filter { it % 5 == 0 }
        .toSet()
}

fun <T> removeDuplicates(collection: Collection<T>?): Set<T>? {
    return collection?.toSet()
}

fun moveZerosToEnd(array: IntArray): IntArray {
    val result = array.filter { it != 0 }.toMutableList()
    val zeroCount = array.size - result.size
    repeat(zeroCount) { result.add(0) }
    return result.toIntArray()
}