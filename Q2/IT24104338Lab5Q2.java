import java.util.Scanner;
public class IT24104338Lab5Q2 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

   // Input: Number of new members introduced

    System.out.print("Enter the number of new members introduced:");
    int newMembers = input.nextInt();


    System.out.print("Input must be a number 0 or greater");

    //Validate the input(>=0)
    if(newMembers < 0){
      System.out.print("Input must be a number 0 or greater");
    }  
      else{

      //Determine the prize 
      String prize;
      switch (newMembers) {

         case 0:
                prize = "No Prize";
                break;
         case 1:
                 prize = "Pen";
                 break;
         case 2:
                 prize = "Umbrella";
                 break;
          
         case 3:
                prize = "Bag";
                 break;
         
         case 4:
                prize = "Travelling Bag";

          default:
                prize = "Headphone";

      }

     System.out.println("You are entiled to: " + prize);

      }

    }
}