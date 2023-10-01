import java.util.*;

public class Q15 {
    void printTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i + 1; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q15 obj = new Q15();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}