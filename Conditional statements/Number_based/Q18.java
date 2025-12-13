import java.util.Scanner;
public class Q18{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=0 && a<=9){
            System.out.println("single digit");
        }
        else if(a>=10 && a<=99)
        {
            System.out.println("two digit");
        }
        else if(a>=100 && a<=999){
            System.out.println("three  digit");
        }
        else{
            System.out.println("Higher digits");
        }
    }}