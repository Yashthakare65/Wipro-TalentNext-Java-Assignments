// Write a Program to accept two integers as command line arguments and print the sum of the two numbers

// Example1
// C:\>java Sample 10 20
// O/P Expected : The sum of 10 and 20 is 30

public class Assignment3 {
  public static void main(String args[]) {
    if (args.length != 2) {
      System.out.println("Plz enter two integer values");
    } else {
      int num1 = Integer.parseInt(args[0]);
      int num2 = Integer.parseInt(args[1]);
      System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
    }
  }
}
