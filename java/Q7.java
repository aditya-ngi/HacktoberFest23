import java.util.Scanner;

public class Q7 {
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q7 obj7 = new Q7();
        Scanner sc = new Scanner(System.in);
        obj7.printTriangle(sc.nextInt());
        sc.close();
    }
}
