import java.util.Scanner;
import java.util.*;
public class Q14 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter radius:");
      int r=sc.nextInt();
      double p=3.14;
      System.out.println("Surface area of sphere is: "+ (p*4*r*r)+"\n");
      System.out.println("Volume of Sphere is: "+((4/3)*p*r*r)  );
      
     
    }
}
