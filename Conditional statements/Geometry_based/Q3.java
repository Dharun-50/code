import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if (x > 0 && y > 0) 
        System.out.println("Quadrant 1");
        else if (x < 0 && y > 0) 
        System.out.println("Quadrant 2");
        else if (x < 0 && y < 0) 
        System.out.println("Quadrant 3");
        else if (x > 0 && y < 0) 
        System.out.println("Quadrant 4");
        else if (x == 0 && y == 0) 
        System.out.println("Origin");
        else System.out.println("On Axis");
    }
}