import java.util.Scanner;

public class Q9{
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter P:");
         
       int a=sc.nextInt();
       System.out.println("Enter R: ");
       int b=sc.nextInt();
        System.out.println("Enter T: ");
       int c=sc.nextInt();
       System.out.println("Simple interest is: "+((a*b*c)/100));
        
    }
}
