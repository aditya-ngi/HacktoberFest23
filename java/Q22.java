import java.util.*;

public class Q22 {

    int max(int a, int b) {
        return a > b ? a : b;
    }

    int min(int a, int b) {
        return a < b ? a : b;
    }

    void printSquare(int n) {
        int i, j, k;
        
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                System.out.print(max(n - i + 1, n - j + 1) + " ");
            }
            for (k = n - 1; k >= 1; k--) {
                System.out.print(max(n - i + 1, n - k + 1) + " ");
            }
            System.out.println();
        }

        for (i = n - 1; i >= 1; i--) {
            for (j = 1; j <= n; j++) {
                System.out.print(max(n - i + 1, n - j + 1) + " ");
            }
            for (k = n - 1; k >= 1; k--) {
                System.out.print(max(n - i + 1, n - k + 1) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q22 obj = new Q22();
        Scanner sc = new Scanner(System.in);
        obj.printSquare(sc.nextInt());
        sc.close();
    }
}