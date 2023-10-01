import java.util.*;

public class Q21 {
    void printSquare(int n) {
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Q21 obj = new Q21();
        Scanner sc = new Scanner(System.in);
        obj.printSquare(sc.nextInt());
        sc.close();
    }
}