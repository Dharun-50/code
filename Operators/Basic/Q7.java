import java.util.*;
public class Q7{
     public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;
        System.out.print("Swap Numbers without third variable:"+num1+" "+num2);
     }
    }
