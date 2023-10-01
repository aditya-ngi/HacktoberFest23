import java.util.Scanner;

public class Q10 {
    void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i < n; i++) {
            for (int k = 1; k < n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q10 obj10 = new Q10();
        Scanner sc = new Scanner(System.in);
        obj10.printTriangle(sc.nextInt());
        sc.close();
    }
}
