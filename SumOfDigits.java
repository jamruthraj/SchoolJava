import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in a number");
        int x = sc.nextInt();
        int r = 0;
        int s = 0;
        while (x > 0) {
            r = x % 10;
            s = s + r;
            x = x / 10;
        }
        System.out.println("Sum of Digits = " + s);
    }
}
