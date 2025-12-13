
import java.util.Scanner;
public class Q12{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int d=a%100;
        if(d%2==0)
            System.out.println("Even");
        else
           System.out.println("odd");

    }}