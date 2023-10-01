import java.util.Scanner;

public class FibonacciSeries{
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("How many terms of Fibonacci Series you want? ");
            int n = sc.nextInt();
            int a=0,b=1,c=0;
            System.out.print("Fibonacci Series: ");
            if(n==1){
                System.out.println(a);
            }
            else if(n==2){
                System.out.println(a+", "+b);
            }
            else{
                System.out.print(a+", "+b);
                for(int i=2;i<=n;i++){
                    c=a+b;
                    System.out.print(", "+c);
                    a=b;
                    b=c;
                }
            }
        }
    }
}