import java.util.Scanner;

public class Menu1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.print("Enter ");
            System.out.println("1 to convert temperature in celsius to fahrenheit");
            System.out.println("2 to convert temperature in fahrenheit to celsius");
            System.out.println("3 to Exit");
            ch = sc.nextInt();
            System.out.println();
            switch(ch)
            {
                case 1:
                    System.out.println("You have selected to  convert temperature in celsius to fahrenheit");
                    System.out.println("Enter the temperature in celsius");
                    int c = sc.nextInt();
                    float tf = (c * 9/5.0f) + 32;
                    System.out.println("Temperature is fahrenheit is "+tf);
                    System.out.println();
                    break;

                case 2:
                    System.out.println("You have selected to convert temperature in fahrenheit to celsius");
                    System.out.println("Enter temperature in fahrenheit");
                    int f = sc.nextInt();
                    float tc = (f - 32) * 5/9.0f;
                    System.out.println("Temperature in celsius is "+tc);
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting .......");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.out.println();
                    break;
            }
        }
        while (ch!=3);
        System.out.println("You have successfully ended your process");
    }
}

