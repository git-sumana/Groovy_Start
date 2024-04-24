// Using 'def' for dynamic typing
def dynamicVariable = "Dynamic"
println("Dynamic Variable: $dynamicVariable (Type: ${dynamicVariable.getClass().getSimpleName()})")

// Using explicit typing
String explicitVariable = "Explicit"
println("Explicit Variable: $explicitVariable (Type: ${explicitVariable.getClass().getSimpleName()})")

// Primitive data types
int integerVariable = 10
println("Integer Variable: $integerVariable (Type: ${integerVariable.getClass().getSimpleName()})")

double doubleVariable = 3.14
println("Double Variable: $doubleVariable (Type: ${doubleVariable.getClass().getSimpleName()})")

boolean booleanVariable = true
println("Boolean Variable: $booleanVariable (Type: ${booleanVariable.getClass().getSimpleName()})")

char charVariable = 'A'
println("Char Variable: $charVariable (Type: ${charVariable.getClass().getSimpleName()})")

// Arrays
def arrayVariable = [1, 2, 3, 4, 5]
println("Array Variable: $arrayVariable (Type: ${arrayVariable.getClass().getSimpleName()})")

// Lists
List<String> listVariable = ["Apple", "Banana", "Orange"]
println("List Variable: $listVariable (Type: ${listVariable.getClass().getSimpleName()})")

// Maps
Map<String, Integer> mapVariable = ["one": 1, "two": 2, "three": 3]
println("Map Variable: $mapVariable (Type: ${mapVariable.getClass().getSimpleName()})")
