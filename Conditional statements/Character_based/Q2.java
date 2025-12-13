import java.util.Scanner;
public class Q2{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        double ch =sc.next().charAt(0);
        if(ch>='A' && ch<='Z' )
            System.out.println("Uppercase");
        else if(ch>=0 && ch<=9){
            System.out.println("Digits");}
        else if(ch>='a' && ch<='z')
        {
            System.out.println("Lowercase");
        }
        else{
            System.out.println("Special symbols");
        }}
        }