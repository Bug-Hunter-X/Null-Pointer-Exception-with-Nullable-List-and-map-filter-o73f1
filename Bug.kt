```kotlin
fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }.filter { it > 5 }
    println(result) // Output: [6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }.filter { it > 5 }
    println(emptyResult) // Output: []

    //This is incorrect
    val nullableList: List<Int>? = null
    val nullableResult = nullableList?.map { it * 2 }?.filter { it > 5 }
    println(nullableResult) // Output: null
}
```