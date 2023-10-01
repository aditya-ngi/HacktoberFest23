import java.util.*;
public class Addition2 
{
 int a;
 int b;
 public void input(int x,int y)
 {
     a=x;
     b=y;
 }   
 public int sum()
 {
     return(a+b);
 }
 public static void main(String args[])
 {
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter two numbers");
     int x=sc.nextInt();
     int y=sc.nextInt();
     Addition2 ob=new Addition2();
     ob.input(x,y);
     System.out.println("The sum is"+ob.sum());
 }
}
