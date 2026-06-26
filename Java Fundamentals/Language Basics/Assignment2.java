//  Write a Program to accept a String as a command line argument and print a Welcome message as given below.

// Example1
// C:\> java Sample John
// O/P Expected : Welcome John

public class Assignment2 {
  public static void main(String args[]){
    if(args.length<1){
      System.out.println("Enter command line argument to print welcome message");
    }else{
      System.out.println("Welcome "+args[0]);
    }
    
  }
}
