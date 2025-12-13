import java.util.Scanner;
import java.util.*;
public class Q5 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int r1=sc.nextInt();
       int r2=sc.nextInt();
       int r3;
       if(r1>r2)
        r3=r1-r2;
    else
        r3=r2-r1;
      System.out.println("Distance between two points: "+r3);
    
     
    }
}
