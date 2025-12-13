import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b,c=0;
      b=a%10;
      c=a/100;
      System.out.println(b+c);
    
    }
}