import java.util.*;

class affi {
    void pp() {
        Scanner sc = new Scanner(System.in);
        int var[] = new int[40];
        for (int i = 0; i <= 39; i++) {
            System.out.println("Type In " + (i + 1) + " Number");
            var[i] = sc.nextInt();
        }
        System.out.println("Prime Numbers: ");
        for (int i = 0; i <= 39; i++) {
            int a = var[i];
            int f = 0;
            for (int b = 2; b < a; b++) {
                if (a % b == 0)
                    f += 1;
            }
            if (f == 0)
                System.out.println(a);
        }
        System.out.println();
        System.out.println("Perfect Numbers :");
        for (int l = 0; l <= 39; l++) {
            int c = var[l];
            int tc = c;
            int s = 0;
            for (int k = 1; k < c; k++) {
                if (c % k == 0)
                    s += k;
            }
            if (s == c)
                System.out.println(c);
        }
    }

    void sope() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of The Array");
        int size = sc.nextInt();
        int var[] = new int[size];
        int s = 0;
        int p = 1;
        for (int i = 0; i <= (size - 1); i++) {
            System.out.println("Type In " + (i + 1) + " Number");
            var[i] = sc.nextInt();
        }
        for (int i = 0; i <= (size - 1); i++) {
            int a = var[i];
            if (a % 2 == 0)
                p = p * a;
            else
                s += a;
        }
        System.out.println("Product Of Even Numbers = " + p);
        System.out.println("Sum Of Odd Numbers = " + s);
    }

    void frequency() {
        Scanner sc = new Scanner(System.in);
        String a[] = new String[10];
        for (int i = 0; i <= 9; i++) {
            System.out.println("Enter " + (i + 1) + " City");
            a[i] = sc.nextLine();
        }
        System.out.println("Cities That Begin With Consonants And End With Vowel Are :-");
        for (int j = 0; j <= 9; j++) {
            String s = a[j];
            s = s.toUpperCase();
            char ch = s.charAt(0);
            char ch1 = s.charAt(s.length() - 1);
            if ((ch != 'A' || ch != 'E' || ch != 'I' || ch != 'O' || ch != 'U') && (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'))
                System.out.println(s);
        }
        System.out.println();
        System.out.println();
        System.out.println("Cities That Begin And End With Vowel Are :-");
        for (int k = 0; k <= 9; k++) {
            String s = a[k];
            s = s.toUpperCase();
            char ch = s.charAt(0);
            char ch1 = s.charAt(s.length() - 1);
            if ((ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') && (ch1 == 'A' || ch1 == 'E' || ch1 == 'I' || ch1 == 'O' || ch1 == 'U'))
                System.out.println(s);
        }
    }

    void bs() {
        Scanner sc = new Scanner(System.in);
        char ts[] = new char[10];
        char tss[] = new char[10];
        System.out.println("Enter 10 Letters In Jumbled Order");
        for (int i = 0; i < 10; i++) {
            char a = sc.next().charAt(0);
            if (a > 90)
                a -= 32;
            ts[i] = a;
        }
        for (int j = 'A'; j <= 'Z'; j++) {
            for (int k = 0; k <= 9; k++) {
                char ch = ts[k];
                if (ch == j)
                    tss[k] = ch;
            }
        }
        System.out.println("Letters In Ascending Order :-");
        for (int m = 0; m < 10; m++)
            System.out.println(tss[m]);
    }

    void doubled() {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[4][3];
        System.out.println("Enter 12 Elements Of The Matrix");
        for (int i = 0; i <= 3; i++) {
            for (int j = 0; j <= 2; j++)
                x[i][j] = sc.nextInt();
        }
        System.out.println("Even Numbers Beginning With Four Are :-");
        for (int k = 0; k <= 3; k++) {
            for (int l = 0; l <= 2; l++) {
                int a = x[k][l];
                if (a % 2 == 0) {
                    int tn = a;
                    int tp = 0;
                    while (tn > 0) {
                        int r = tn % 10;
                        tp += 1;
                        tn = tn / 10;
                    }
                    int p = (int) Math.pow(10, tp - 1);
                    int fd = a / p;
                    if (fd == 4)
                        System.out.println(a);
                }
            }
        }
    }

    void sofrows() {
        Scanner sc = new Scanner(System.in);
        int x[][] = new int[3][3];
        System.out.println("Enter Elements Of The Matrix");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 2; j++)
                x[i][j] = sc.nextInt();
        }
        System.out.println();
        for (int k = 0; k < 3; k++) {
            for (int l = k; l < k + 1; l++) {
                int s = 0;
                for (int m = 0; m < 3; m++) {
                    s += x[l][m];
                }
                System.out.println("Sum Of " + (k + 1) + " Row Is " + s);
            }
        }
    }

    void unit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size Of The Unit Matrix");
        int r = sc.nextInt();
        int c = sc.nextInt();
        int u[][] = new int[r][c];
        if (r == c) {
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    if (i == j)
                        u[i][j] = 1;
                    else
                        u[i][j] = 0;
                    System.out.print(u[i][j] + "\t");
                }
                System.out.println();
            }
        } else
            System.out.println("Unit Matrix Not Possible");
        System.out.println();
    }
}

public class arrayfunctions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        affi obj = new affi();
        int ch = 0;
        do {
            System.out.println("Enter 1 To Print Prime And Perfect Numbers From 40 Numbers");
            System.out.println("Enter 2 To Print Sum Of Odd Numbers And Product Of Even Numbers");
            System.out.println("Enter 3 To Print The Names Of Cities in a Sorted Way");
            System.out.println("Enter 4 To Sort Letters In Ascending Order");
            System.out.println("Enter 5 To Print Unit Matrix");
            System.out.println("Enter 6 For Double Dimensional Array and Print Multiples of 4");
            System.out.println("Enter 7 To Calculate The Sum Of Rows");
            System.out.println("Enter 8 To Exit");
            System.out.println();
            ch = sc.nextInt();
            if (ch == 1)
                obj.pp();
            else if (ch == 2)
                obj.sope();
            else if (ch == 3)
                obj.frequency();
            else if (ch == 4)
                obj.bs();
            else if (ch == 5)
                obj.unit();
            else if (ch == 6)
                obj.doubled();
            else if (ch == 7)
                obj.sofrows();
            else if (ch == 8)
                System.out.println("Exiting .......");
            else
                System.out.println("Invalid Choice");
        } while (ch != 8);
    }
}