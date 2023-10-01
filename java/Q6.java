import java.util.Scanner;

public class Q6 {
    public void printTriangle(int n) {
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q6 obj6 = new Q6();
        Scanner sc = new Scanner(System.in);
        obj6.printTriangle(sc.nextInt());
        sc.close();
    }
}
