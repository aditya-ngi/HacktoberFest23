import java.util.*;

public class Q18 {
    void printTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {

            for (j = 1; j <= i; j++) {
                System.out.print((char) (n - j + 65) + " ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q18 obj = new Q18();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}