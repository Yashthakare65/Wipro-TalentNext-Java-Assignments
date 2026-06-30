// B) Given two non-negative int values, print true if they have the same last digit, such as with 27 and 57. 

//      lastDigit(7, 17) → true
//      lastDigit(6, 17) → false
//      lastDigit(3, 113) → true

import java.util.Scanner;

public class Assignment1B {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter First Non-Negative Value:");
    int num1=sc.nextInt();
    System.out.print("Enter Second Non-Negative Value:");
    int num2=sc.nextInt();

    if(num1%10==num2%10){
      System.out.println("Both values have same Last Digit which is "+num1%10);
    }else{
      System.out.println("Both values don't have same Last Digit, the first value last digit is "+num1%10+" and the second value last digit is "+num2%10);
    }
  }
}
