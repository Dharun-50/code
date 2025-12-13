import java.util.*;
public class Q4{
    public static void main(String[]args){
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt(),b=sc.nextInt();
         int diff=a-b;
         if(diff%2==0){
            System.out.println("Even:"+diff);
         }
         else{
            System.out.println("Odd:"+diff);
         }
    }
}