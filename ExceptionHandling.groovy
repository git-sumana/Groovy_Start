try {
    // Example 1: ArithmeticException
    def result = 10 / 0
} catch (ArithmeticException e) {
    println "ArithmeticException occurred: ${e.message}"
}

try {
    // Example 2: NullPointerException
    def str = null
    println str.length()
} catch (NullPointerException e) {
    println "NullPointerException occurred: ${e.message}"
}

try {
    // Example 3: IndexOutOfBoundsException
    def list = [1, 2, 3]
    println list[10]
} catch (IndexOutOfBoundsException e) {
    println "IndexOutOfBoundsException occurred: ${e.message}"
}
