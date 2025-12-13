import java.util.Scanner;
import java.util.*;
public class Q7 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
       System.out.println("Enter the celcius: ");
      double a=sc.nextInt();
      double b;
     
      b=(a*(9/5))+32;
      System.out.printf("Fahrenheit is: %.2f",b);
    
    }
}
