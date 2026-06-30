// Write a program to check if a given integer number is odd or even.

import java.util.Scanner;

public class Assignment3 {
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);

    System.out.print("Enter Integer Value:");
    int num=sc.nextInt();

    if(num%2==0){
      System.out.println("Entered Integer Value is EVEN");
    }else{
      System.out.println("Entered Integer Value is ODD");
    }
  }
}
