import java.util.Scanner;

public class Menu3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do {

            System.out.println("Enter 1 for Buzz Number");
            System.out.println("Enter 2 for GCD");
            System.out.println("Enter 3 to Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Buzz Number");
                    System.out.println("Enter the number");
                    int a = sc.nextInt();
                    if (a % 7 == 0)
                        System.out.println(a + " is a buzz number");
                    else if (a % 10 == 7)
                        System.out.println(a + " is  a buzz number");
                    else
                        System.out.println(a + " Not a buzz number Number");
                    break;

                case 2:
                    System.out.println("GCD of two numbers");
                    System.out.println("Enter the first number");
                    int b = sc.nextInt();
                    System.out.println("Enter Second Number");
                    int c = sc.nextInt();
                    int d = 0;
                    for (int i = 1; i <= b || i <= c; i++) {
                        if (b % i == 0 && c % i == 0)
                            d = i;
                    }
                    System.out.println("GCD of " + b + " and " + c + " is " + d);
                    break;

                case 3:
                    System.out.println("Exiting ......");
                    break;

                default:
                    System.out.println("Invald Choice");
                    break;

            }
        } while (ch != 3);
        System.out.println("You have successfully completed your process");
    }
}
