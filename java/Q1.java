
/*
 *  * * * *
 *  * * * *
 *  * * * *
 *  * * * *
*/
import java.util.*;

public class Q1 {

    public void printSquare(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q1 obj = new Q1();
        Scanner sc = new Scanner(System.in);
        obj.printSquare(sc.nextInt());
        sc.close();
    }
}
