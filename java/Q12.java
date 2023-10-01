import java.util.*;

public class Q12 {
    void printTriangle(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }

            for (k = 1; k <= 2 * (n - i); k++) {
                System.out.print("  ");
            }

            for (j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q12 obj = new Q12();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}