import java.util.Scanner;
/**
 * Determines the factors of user number
 * @author Jaden Ramcharan
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Creates scanner for user input
    Scanner input = new Scanner(System.in);

    //declare user input variable
    int userNum = 0;

    //Asks user to enter positive number, if number is negative, asks again
    do{
      System.out.println("Please enter a positive integer to determine its factors:");
      userNum = input.nextInt();
    }while(userNum <= 0);

    //declare and initialize count and factor variable
    int count = 0;
    int factor = 0;

    // Tells user what the following information is
    System.out.println("The factors of " + userNum + " are:");

    //beginning of main factoring loop
    while(count < userNum){
      count = count + 1;
      factor = userNum % count;
      //determines if userNum divides evenly with current count
      if(factor == 0){
        System.out.println(count);
      }
    }
    
  }
}
