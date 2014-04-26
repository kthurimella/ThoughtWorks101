import java.util.*;

/**
 FizzBuzz is a simple number game where you count, but say "Fizz" and/or "Buzz" instead of numbers adhering to certain rules.
 */
public class FizzBuzz {

    public static void displayFizzBuzz(int n){
        if (n < 1){
            System.out.print("Please input a number between 1 and 100.");
            System.exit(1);
        }
        for(int i = 1; i < n + 1; i++){

            if (i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }
            else {
                System.out.println(i);
            }

        }


    }

    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number n, to calculate FizzBuzz:");
        int n = reader.nextInt();

        displayFizzBuzz(n);
    }
}
