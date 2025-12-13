import java.util.*;
public class Q8{
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the Integer:");
       int n=sc.nextInt();
       String oct=Integer.toOctalString(n);
       System.out.println("Octal Format: "+oct);

    }
}
