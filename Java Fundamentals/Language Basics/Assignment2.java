public class Assignment2 {
  public static void main(String args[]){
    if(args.length<1){
      System.out.println("Enter command line argument to print welcome message");
    }else{
      System.out.println("Welcome "+args[0]);
    }
    
  }
}
