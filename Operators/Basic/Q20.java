import java.util.Scanner;
import java.util.*;
public class Q20 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int b=sc.nextInt();
      int c=sc.nextInt();
      int g=(a+b+c)/3;
      if(g>49)
        System.out.println("Passed");
    else
        System.out.println("Failed");
    }
}
