
public class ProgrammingExercise6_26 {
 
 public static void main(String[] args) {
  final int NUMBER_OF_PALINPRIME = 100;
  int numberPrinted = 0, testedNumber = 2;
 
  while (numberPrinted < NUMBER_OF_PALINPRIME) {
   if (isPrime(testedNumber) && isPalindrome(testedNumber)) {
    numberPrinted++;
    System.out.print(testedNumber + " ");
    if (numberPrinted % 10 == 0) {
     System.out.println();
    }
   }
   testedNumber++;
  }
 
 }
 
 /** Check whether number is prime */
 public static boolean isPrime(int number) {
  for (int divisor = 2; divisor <= number / 2; divisor++) {
   if (number % divisor == 0) { // If true, number is not prime
    return false; // number is not a prime
   }
  }
 
  return true; // number is prime
 }
 
 public static int reverse(int number) {
  int reverse = 0;
  int digit;
 
  do {
   digit = number % 10;
   reverse = reverse * 10 + digit;
   number /= 10;
  } while (number != 0);
 
  return reverse;
 }
 
 public static boolean isPalindrome(int number) {
 
  return (number == reverse(number));
 
 }
 
}