import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) throws Exception {
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter Candies:");
         
       int a=sc.nextInt();
       System.out.println("Enter students:");
         
       int b=sc.nextInt();
       int c=a%b;
       a=a-c;
       System.out.println("Splited candies: "+a/b);
       System.out.println("remaining candies: "+c);
      
        
    }
}
