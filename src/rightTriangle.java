import java.util.*;

/**
 Given a number n, print n lines, each with one more asterisk than the last (i.e. one on the first line, two on the second,etc.)
 Example when n=3:
 *
 **
 ***
 */
public class rightTriangle {


    public static void displayRightTriangle(int n){
        for (int i = 1; i < n + 1; i++){
            int j = i;
            while (j > 0) {
                System.out.print("*");
                j--;
            }
            System.out.println();
        }
    }


    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        System.out.println("Enter the number of asterisks, n:");
        int n = reader.nextInt();

        displayRightTriangle(n);
    }
}
