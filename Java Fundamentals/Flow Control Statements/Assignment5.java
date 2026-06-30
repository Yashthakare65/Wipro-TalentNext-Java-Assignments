//  Initialize a character variable in a program and 

// print 'Alphabhet' if the initialized value is an alphabhet, 

// print 'Digit' if the initialized value is a number, and 

// print 'Special Character', if the initialized value is anything else.

import java.util.Scanner;

public class Assignment5 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Enter number,aplhabet or anything:");
    char ch = sc.next().charAt(0);

    if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
      System.out.println("Alphabet");
    } else if (ch >= '0' && ch <= '9') {
      System.out.println("Digit");
    } else {
      System.out.println("Special Character");
    }
  }
}
