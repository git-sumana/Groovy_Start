import java.util.*;
class Main {
  static def maskAccountNumber(String accountNumber) {
    def maskedNumber = accountNumber.take(accountNumber.size() - 4).replaceAll("\\d", "*") + accountNumber[-4..-1]
    return maskedNumber
  }
  static void main(args){
    Scanner s=new Scanner(System.in)
    println "Enter Number"
    def accountNumber=s.next()
    println maskAccountNumber(accountNumber)
  }
}
