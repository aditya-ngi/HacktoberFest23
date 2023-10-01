import java.util.Scanner;

public class Q5 {
    public void printTriangle(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q5 obj5 = new Q5();
        Scanner sc = new Scanner(System.in);
        obj5.printTriangle(sc.nextInt());
        sc.close();
    }

}
