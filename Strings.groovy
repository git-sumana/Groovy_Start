// Concatenation
def str1 = "Hello"
def str2 = "World"
def concatenated = str1 + " " + str2

// Concatenation using concat() method
def concatenated2 = str1.concat(" ").concat(str2)

println("Concatenation:")
println("Result 1: $concatenated")
println("Result 2: $concatenated2")

// String Interpolation
def name = "Alice"
def age = 30
def interpolated = "My name is ${name} and I am ${age} years old."

println("\nString Interpolation:")
println(interpolated)

// Length of a String
def str = "Groovy"
def length = str.length()

println("\nLength of String:")
println("Length of '${str}': ${length} ")

// Substring
def substring = str.substring(2, 5)

println("\nSubstring:")
println("Substring of '${str}': ${substring}")

// Uppercase and Lowercase
def uppercase = str.toUpperCase()
def lowercase = str.toLowerCase()

println("\nUppercase and Lowercase:")
println("Uppercase of '${str}': ${uppercase}")
println("Lowercase of '${str}': ${lowercase}")

// Trim
def paddedStr = "  Groovy   "
def trimmed = paddedStr.trim()

println("\nTrim:")
println("Trimmed '${paddedStr}': '${trimmed}'")

// Replace
def originalStr = "I love Java"
def replaced = originalStr.replace("Java", "Groovy")

println("\nReplace:")
println("Replaced '${originalStr}': '${replaced}'")
