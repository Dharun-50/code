import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Amount: ");
        int amount = sc.nextInt();

        int n2000 = amount / 2000;
        amount = amount % 2000;

        int n500 = amount / 500;
        amount = amount % 500;

        int n100 = amount / 100;

        System.out.println("2000 notes: " + n2000);
        System.out.println("500 notes : " + n500);
        System.out.println("100 notes : " + n100);

        sc.close();
    }
}

