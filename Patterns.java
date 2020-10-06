import java.util.Scanner;

public class Patterns {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int ch = 0;
        do
        {
            System.out.println("Enter ");
            System.out.println("1. for  s = 1/4 + 1/8 .... n");
            System.out.println("2. for s = 1/1! + 2/2! ..... n");
            System.out.println("3. to exit");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("s = 1/4 + 1/8.......n");
                    float s = 0.0f;
                    System.out.println("Enter the limit");
                    int n = sc.nextInt();
                    for(int i = 4;i<=n;i+=4)
                        s = s + (float) 1/i;
                    System.out.println("Sum = "+s);
                    break;

                case 2:
                    System.out.println("s = 1/1! + 2/2! ....... n");
                    float c = 0.0f;
                    System.out.println("Enter the limit");
                    int d = sc.nextInt();
                    for(int i = 1;i<=d;i++)
                    {
                        int f = 1;
                        int j = i;
                        for(j=1;j <=i;j++)
                        {
                            f=f*i;
                        }
                        c += (float)i/f;
                    }
                    System.out.println("Sum = "+c);
                    break;

                case 3 :
                    System.out.println("Exiting .......");
                    break;

                default :
                    System.out.println("Invalid choice ");
                    break;
            }
        }
        while ( ch !=3);
        System.out.println("You have successfully ended your process");
    }
}
