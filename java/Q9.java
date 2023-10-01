import java.util.Scanner;

public class Q9 {
    void printDiamond(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= n - i + 1; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q9 obj9 = new Q9();
        Scanner sc = new Scanner(System.in);
        obj9.printDiamond(sc.nextInt());
        sc.close();
    }

}
