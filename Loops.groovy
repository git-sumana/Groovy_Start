// For loop
println("For Loop:")
for (int i = 1; i <= 5; i++) {
    println("Iteration $i")
}

// While loop
println("\nWhile Loop:")
def j = 1
while (j <= 5) {
    println("Iteration $j")
    j++
}

// Enhanced for loop (for-each loop) with a list
println("\nEnhanced For Loop (for-each loop):")
def fruits = ["Apple", "Banana", "Orange"]
for (fruit in fruits) {
    println(fruit)
}

// Looping through a map
println("\nLooping Through a Map:")
def ages = ["John": 30, "Jane": 25, "Alice": 35]
for (entry in ages) {
    println("${entry.key} is ${entry.value} years old")
}

// Looping through a range
println("\nLooping Through a Range:")
for (num in 1..5) {
    println(num)
}
