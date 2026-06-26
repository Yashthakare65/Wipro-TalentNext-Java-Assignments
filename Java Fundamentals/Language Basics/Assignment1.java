//  Write a Program that accepts two Strings as command line arguments and generate the output in the required format. 

// Example1
// If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

class Assignment1{
  public static void main(String args[]){
    if(args.length != 2 ){
      System.out.println("Enter Two Strings");
    }else{
      System.out.println(args[0]+" Technologies "+args[1]);
    }
  }
}