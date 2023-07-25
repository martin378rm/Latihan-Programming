package data;

public class ReverseNumber {

  public static void main(String[] args){
     int number = 678970;
     int reversedNumber = reverseNumber(number);
      System.out.println("Number: " + number);
      System.out.println("Reversed Number: " + reversedNumber);
  }

  public static int reverseNumber(int num) {
        int reversed = 0;
          while (num != 0) {
              System.out.println("num 1 :" +num);
              int digit = num % 10;
              System.out.println("digit: "+digit);
              reversed = reversed * 10 + digit;
              System.out.println("reversed : " + reversed);
              num /= 10;
              System.out.println("num 2: " + num);
          }
        return reversed;
  }

}

