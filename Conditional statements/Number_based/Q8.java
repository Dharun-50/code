import java.util.Scanner;

public class Q8 {
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=a%10;
        if(b%3==0)
            System.out.println("Divisible by 3");
        else
            System.out.println("Not divisible by 3");
    }
}
