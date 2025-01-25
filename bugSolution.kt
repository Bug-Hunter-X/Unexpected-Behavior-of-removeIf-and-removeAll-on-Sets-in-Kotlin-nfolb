fun main() {
    val set = mutableSetOf(1, 2, 3, 4, 5)
    val iterator = set.iterator()
    while (iterator.hasNext()) {
        if (iterator.next() > 2) {
            iterator.remove()
        }
    }
    println(set) // Output: [1, 2]

    val set2 = mutableSetOf(1, 2, 3, 4, 5)
    set2.retainAll { it <=2 }
    println(set2) // Output: [1, 2]
}    
