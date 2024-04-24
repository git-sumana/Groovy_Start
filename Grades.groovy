import java.util.Scanner

def main() {
    try {
        Scanner scanner = new Scanner(System.in)
        
        print("Enter your marks: ")
        int marks = scanner.nextInt()
        
        def grade = calculateGrade(marks)
        println("Your grade is: $grade")
        
        scanner.close()
    } catch (Exception e){}
}

def calculateGrade(marks) {
    if (marks >= 90) {
        return "A"
    } else if (marks >= 80) {
        return "B"
    } else if (marks >= 70) {
        return "C"
    } else if (marks >= 60) {
        return "D"
    } else {
        return "F"
    }
}

main()
