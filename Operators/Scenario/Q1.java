import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Price:");
         
       int a=sc.nextInt();
       System.out.println("Enter discount: ");
       int b=sc.nextInt();
       System.out.println("Final price is: "+(a-b));
        
    }
}