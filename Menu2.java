import java.util.*;
class Menu2
{
    public static void main(String... args)
    {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do
        {
            System.out.print("Enter ");
            System.out.println("1 to check whether the inputed number is palindrome");
            System.out.println("2 to check whether the inputed number is perfect number");
            System.out.println("3 to Exit");
            ch = sc.nextInt();
            System.out.println();
            switch(ch)
            {
                case 1:
                    System.out.println("You have selected to check whether a number is palindrome or not");
                    System.out.println("Enter a number to check whether it is a palindrome or not");
                    int a = sc.nextInt();
                    int b = a;
                    int s =  0;
                    int r = 0;
                    while ( b > 0 )
                    {
                        r = b % 10;
                        s = s * 10 + r;
                        b = b/10;
                    }
                    if ( s == a)
                        System.out.println(a+" is a palindrome number");
                    else
                        System.out.println(a+" is not a palindrome number");
                    System.out.println();
                    break;

                case 2 :
                    System.out.println("You have selected to check a number whether it is a perfect number or not");
                    System.out.println("Enter a number to check whether it is a perfect number or not");
                    int c = sc.nextInt();
                    int d = 0;
                    for  (int i = 1; i<c ;i++)
                    {
                        if ( c%i == 0)
                            d+= i;
                    }
                    if(c == d)
                        System.out.println(c+" is a perfect number");
                    else
                        System.out.println(c+" is not a perfect number");
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Exiting .........");
                    System.out.println();
                    break;

                default:
                    System.out.println("Invalid choice");
                    System.out.println();
                    break;
            }
        }
        while (ch!=3);
        System.out.println("You have completed your process successfully");
    }
}