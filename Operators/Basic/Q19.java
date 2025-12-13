import java.util.Scanner;
import java.util.*;
public class Q19 {
    public static void main(String[] args) throws Exception {
      Scanner sc=new Scanner(System.in);
      int a=sc.nextInt();
      int g;
      int b=sc.nextInt();
      int c=sc.nextInt();
    if(a>b&&a>c)
        g=a;
    else if(b>a&&b>c)
        g=b;
    else
        g=c;
    System.out.println("Greatest is: "+g);
    }
}
