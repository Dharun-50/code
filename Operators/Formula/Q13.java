import java.util.Scanner;
import java.util.*;
public class Q13 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter sides (l,w,h):");
      int l=sc.nextInt();
      int w=sc.nextInt();
      int h=sc.nextInt();
      System.out.println("Surface area of cube is: "+ 2*((l*w)+(l*h)+(h*w))+"\n");
      System.out.println("Volume of cube is: "+(l*w*h)  );
      
     
    }
}
