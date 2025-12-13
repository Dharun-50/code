import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Pens price:");
         
       int a=sc.nextInt();
       System.out.println("Amount bought: ");
       int b=sc.nextInt();
        
      int c,d;
      c=b-2*(b/5);
        d=a*c;
       System.out.println("Pay only for: "+c);
       System.out.println("Amount: "+d);
        
    }
}
