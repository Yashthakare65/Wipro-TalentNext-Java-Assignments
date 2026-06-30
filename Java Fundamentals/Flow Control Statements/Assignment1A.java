//  A) Write a program to check if a given integer number is Positive, Negative, or Zero.

import java.util.Scanner;

public class Assignment1A {
  public static void main(String args[]){
    Scanner sc =new Scanner(System.in);
    System.out.print("Enter Integer Value:");
    int num =sc.nextInt();

    if(num==0){
      System.out.println("The Entered Integer value is ZERO");
    }else if(num>0){
      System.out.println("The Entered Integer value is POSITIVE");
    }else{
      System.out.println("The Entered Integer value is NEGATIVE");
    }
  }
}
