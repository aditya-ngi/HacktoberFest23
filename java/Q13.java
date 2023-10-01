import java.util.*;

public class Q13 {
    void printTriangle(int n) {
        int i, j, k = 1;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q13 obj = new Q13();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}