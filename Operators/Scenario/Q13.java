import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Mango Price:");
         
       int a=sc.nextInt();
       System.out.println("Enter Amount of mangoes: ");
       int b=sc.nextInt();
        
      int c,d;
      c=(b/3)+b;
        d=a*b;
       System.out.println("Received: "+c);
       System.out.println("Amount: "+d);
        
    }
}
