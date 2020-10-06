
import java.util.Scanner;

class stringfunctions {
    void palindrome(String s1) {
        String rev = "";
        for (int i = s1.length() - 1; i >= 0; i--) {
            char ch = s1.charAt(i);
            rev += ch;
        }
        if (s1.equalsIgnoreCase(rev))
            System.out.println("It is a palindrome");
        else
            System.out.println("It Is Not a palindrome");
    }

    void Upper_Lower(String s2) {
        int up = 0;
        int lc = 0;
        for (int i = 0; i < s2.length(); i++) {
            char ch = s2.charAt(i);
            if (ch >= 65 && ch <= 90)
                up += 1;
            else if (ch >= 97 && ch <= 122)
                lc += 1;
        }
        System.out.println("Upper Case Letters = " + up);
        System.out.println("Lower Case Letters = " + lc);
    }

    void vowels(String s3) {
        int nv = 0;
        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);
            if (ch == 'a' || ch == 'A')
                nv += 1;
            else if (ch == 'e' || ch == 'E')
                nv += 1;
            else if (ch == 'i' || ch == 'I')
                nv += 1;
            else if (ch == 'o' || ch == 'O')
                nv += 1;
            else if (ch == 'u' || ch == 'U')
                nv += 1;
        }
        System.out.println("Number of vowels = " + nv);
    }

    void encode(String s4) {
        String es = "";
        for (int i = 0; i < s4.length(); i++) {
            char ch = s4.charAt(i);
            ch += 1;
            if (ch > 90 && ch < 96)
                ch = 'a';
            else if (ch > 122)
                ch = 'A';
            es += ch;
        }
        System.out.println("Encoded String  = " + es);
    }

    void encode2(String s5) {
        Scanner sc = new Scanner(System.in);
        String es = "";
        System.out.println("Enter Number Of Characters to be encoded");
        int n = sc.nextInt();
        for (int i = 0; i < s5.length(); i++) {
            char ch = s5.charAt(i);
            if (ch >= 65 && ch <= 90) {
                ch += (char) n;
                if (ch > 97)
                    ch -= 26;
            } else if (ch >= 97 && ch <= 122) {
                ch += (char) n;
                if (ch > 122)
                    ch -= 26;
            }
            es += ch;
        }
        System.out.println("Encoded String  = " + es);
    }

    void TitleCase(String s6) {
        String s1 = "";
        int a = 0;
        for (int i = 1; i < s6.length(); i++) {
            char ch = s6.charAt(i);
            char ch1 = s6.charAt(i - 1);
            if (ch1 == 31 && ch == 32) {
                a++;
                continue;
            }
            if (ch == 32 || ch == ',' || ch == '.' || i == s6.length() - 1) {
                String w = s6.substring(a, i);
                if (i == s6.length() - 1)
                    w = s6.substring(a);
                a = i + 1;
                w = w.toLowerCase();
                char ch2 = w.charAt(0);
                ch2 -= 32;
                s1 += ch2 + w.substring(1) + " ";
            }
        }
        System.out.println("Original String is " + s6);
        System.out.println("Title Case is " + s1);
    }

    void ShortName(String s7) {
        String s1 = "";
        int a = 0;
        int c = 0;
        for (int i = 1; i < s7.length(); i++) {
            char ch = s7.charAt(i);
            char ch1 = s7.charAt(i - 1);
            if (ch1 == 31 && ch == 32) {
                a++;
                continue;
            }
            if (ch == 32 || ch == ',' || ch == '.' || i == s7.length() - 1) {
                String w = s7.substring(a, i);
                if (i == s7.length() - 1)
                    w = s7.substring(a);
                a = i + 1;
                char ch2 = w.charAt(0);
                c++;
                if (ch2 > 90)
                    ch2 -= 32;
                s1 = s1 + ch2 + ".";
            }
        }
        System.out.println(s1);
    }

    void pattern(String s8) {
        for (int i = 0; i <= s8.length() - 1; i++) {
            for (int j = s8.length() - 2; j >= i; j--)
                System.out.print(" ");
            for (int l = 0; l <= i; l++)
                System.out.print(s8.charAt(l));
            System.out.println();
        }
    }

    void FancyName(String s9) {
        String s1 = "";
        String s2 = "";
        int a = 0;
        for (int i = s9.lastIndexOf(' ') + 1; i <= s9.length() - 1; i++) {
            char ch = s9.charAt(i);
            s1 += ch;
            s1 = s1.toLowerCase();
            char ch1 = s1.charAt(0);
            ch1 -= 32;
            s1 = ch1 + s1.substring(1);
        }
        for (int i = 1; i < s9.length(); i++) {
            char ch = s9.charAt(i);
            char ch1 = s9.charAt(i - 1);
            if (ch1 == 31 && ch == 32) {
                a++;
                continue;
            }
            if (ch == 32 || ch == ',' || ch == '.' || i == s9.length() - 1) {
                if (i == s9.length() - 1)
                    break;
                String w = s9.substring(a, i);
                a = i + 1;
                char ch12 = (w.charAt(0));
                if (ch12 > 91)
                    ch12 -= 32;
                s2 += ch12 + ".";
            }
        }
        System.out.println(s2 + s1);
    }

    void RevEachWord(String s10) {
        String s1 = "";
        int a = 0;
        for (int i = 1; i < s10.length(); i++) {
            char ch = s10.charAt(i);
            char ch1 = s10.charAt(i - 1);
            String w = "";
            if (ch1 == 31 && ch == 32) {
                a++;
                continue;
            }
            if (ch == 32 || ch == ',' || ch == '.' || i == s10.length() - 1) {
                w = s10.substring(a, i);
                if (i == s10.length() - 1)
                    w = s10.substring(a);
                a = i + 1;
                String rev = "";
                for (int k = w.length() - 1; k >= 0; k--) {
                    char cha = w.charAt(k);
                    rev += cha;
                }
                w = rev + " ";
            }
            s1 += w;
        }
        System.out.println("Original String = " + s10);
        System.out.println("Reversed String = " + s1);
    }

    public static void main(String[] args) {
        stringfunctions obj = new stringfunctions();
        Scanner sc = new Scanner(System.in);
        int ch;
        do {
            System.out.println("Enter a String");
            String s = sc.nextLine();
            System.out.println("Enter 1 To Check For Palindrome ");
            System.out.println("Enter 2 To Check For Upper And Lower Cases");
            System.out.println("Enter 3 To Check For Number Of Vowels");
            System.out.println("Enter 4 To Encode A String");
            System.out.println("Enter 5 To Encode A String By n Characters");
            System.out.println("Enter 6 To Convert The String Into Title Case");
            System.out.println("Enter 7 To Print Short Name");
            System.out.println("Enter 8 To Print Pattern");
            System.out.println("Enter 9 To Print Fancy Name");
            System.out.println("Enter 10 To Print Reverse Of Each Word");
            System.out.println("Enter 11 to Exit");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    obj.palindrome(s);
                    break;
                case 2:
                    obj.Upper_Lower(s);
                    break;
                case 3:
                    obj.vowels(s);
                    break;
                case 4:
                    obj.encode(s);
                    break;
                case 5:
                    obj.encode2(s);
                    break;
                case 6:
                    obj.TitleCase(s);
                    break;
                case 7:
                    obj.ShortName(s);
                    break;
                case 8:
                    obj.pattern(s);
                    break;
                case 9:
                    obj.FancyName(s);
                    break;
                case 10:
                    obj.RevEachWord(s);
                    break;
                case 11:
                    break;
                default:
                    System.out.println("Invalid input");
            }
        } while (ch != 11);

    }
}

