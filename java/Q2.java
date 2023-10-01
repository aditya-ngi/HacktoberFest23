
/*
 *  *
 *  **
 *  ***
 *  ****
 *  *****
*/
import java.util.*;

public class Q2 {

    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Q2 obj = new Q2();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}
