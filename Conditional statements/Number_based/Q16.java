import java.util.Scanner;
public class Q16{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a%2==0 && a%5==0 && a%8!=0){
            System.out.println("Divsible by 2 and 5 not by 8");
        }
    }}