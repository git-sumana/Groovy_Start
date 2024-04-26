// Creating a list
def numbers = [1, 2, 3, 4, 5]

// Adding an element to the end of the list
numbers.add(6)

// Adding an element at a specific index
numbers.add(2, 10)

// Removing an element by value
numbers.remove(4)

// Removing an element by index
numbers.removeAt(0)

// Getting the size of the list
def size = numbers.size()

// Checking if the list is empty
def isEmpty = numbers.isEmpty()

// Getting an element at a specific index
def element = numbers.get(2)

// Checking if the list contains a specific element
def containsElement = numbers.contains(3)

// Sorting the list
numbers.sort()

// Printing the list
println "List after operations: $numbers"
println "Size of the list: $size"
println "Is the list empty? $isEmpty"
println "Element at index 2: $element"
println "Does the list contain 3? $containsElement"
