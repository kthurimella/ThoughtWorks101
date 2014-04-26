import java.util.*;

/**
 Given a number n, print n asterisks on one line.
 Example when n=8:
 ********
 */
public class Horizontal {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of asterisks, n:");
        int n = reader.nextInt();

        for (int i = 0; i < n; i++){
            System.out.print("*");
        }
    }
}
