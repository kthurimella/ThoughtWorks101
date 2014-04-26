import java.util.*;

/**
 Given a number n, print n lines, each with one asterisks
 Example when n=3:
 *
 *
 *
 */
public class Vertical {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of asterisks, n:");
        int n = reader.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}
