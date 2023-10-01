import java.util.*;

public class Q17 {
    void printTriangle(int n) {
        int i, j, k;
        for (i = 1; i <= n; i++) {

            for (k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }

            for (j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }

            for (j = i-1; j >= 1; j--) {
                System.out.print((char) (j + 64));
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q17 obj = new Q17();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}