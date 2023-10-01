import java.util.*;

public class Q14 {
    void printTriangle(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q14 obj = new Q14();
        Scanner sc = new Scanner(System.in);
        obj.printTriangle(sc.nextInt());
        sc.close();
    }
}