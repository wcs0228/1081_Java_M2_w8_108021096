import java.util.Scanner;

public class test1 {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n ;
        int a = 0;
        int b = 0;
        int c = 0;
        while (true) {
            n = scn.nextInt();
            if (n == -999) {
                break;
            }
            if (n > 0) {
                a++;
            } else if (n == 0) {
                b++;
            } else {
                c++;
            }
        }

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }
}