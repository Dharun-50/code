import java.util.Scanner;
public class Q1{
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        char a=sc.next().charAt(0);
        char b=Character.toUpperCase(a);
        if(b=='A' || b=='E'||b=='I'||b=='O'||b=='U'){
            System.out.println("Vowels");
        }
        else{
            System.out.println("Consonents");
        }}}