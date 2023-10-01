import java.util.*;

public class Q20 {
    void printTriangle(int n) {
        int i, j, k;

        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            for (k = 1; k <= (n - i) * 2; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (i = 2; i <= n; i++) {

            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            for (k = 1; k <= (i - 1) * 2; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= n - i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q20 obj = new Q20();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}