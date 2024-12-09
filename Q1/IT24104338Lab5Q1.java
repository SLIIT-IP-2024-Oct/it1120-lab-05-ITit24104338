import java.util.Scanner;
public class IT24104338Lab5Q1 {
    public static void main(String[] args) {
   

  Scanner input = new Scanner(System.in); // Create a Scanner object

  //Input from the user
  System.out.println("Enter the first integer: ");
  int num1 = input.nextInt();

  System.out.println("Enter the second integer: ");
  int num2 = input.nextInt();

  System.out.println("Enter the third integer: ");
  int num3 = input.nextInt();

  // Read numbers
  System.out.println("User entered numbers are : ");

  //Find the smallest and largest number
  int smallest = num1;
  int largest = num2;
   if (num1 < smallest) {
      smallest = num1; 
    }
   
    if (num2 < largest) {
        largest = num2; 
    }

    if (num3 > largest); {
      largest = num3;  
    }

 // Display the results
  System.out.println();
  System.out.println("The smallest number is: "+ smallest);
  System.out.println("The largest number is: "+ largest);

    }
}