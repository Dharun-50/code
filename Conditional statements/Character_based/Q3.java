
import java.util.Scanner;
public class Q3{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=Character.toUpperCase(a);
        if(b>='A' && b<='Z' ){
            System.out.println("Alphabtes");
        }
        else{
            System.out.println("Not Alphabets");
        }}}