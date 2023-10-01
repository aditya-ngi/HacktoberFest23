import java.util.*;

public class Q11 {
    void printTriangle(int n) {
        int k;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0)
                k = 0;
            else
                k = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ % 2 + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q11 obj = new Q11();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}
