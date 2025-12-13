import java.util.Scanner;
import java.util.*;
public class Q6 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      double a=sc.nextInt();
      double b;
      System.out.println("Enter the fahrenheit: ");
      b=(a-32)*5/9;
      System.out.printf("Celcius is: %.2f",b);
    
    }
}
