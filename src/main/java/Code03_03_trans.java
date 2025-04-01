import java.util.Scanner;

public class Code03_03_trans {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int res = a + b - c;

        System.out.println(a + "+"+ b + "-" + c + "=" + res);

        sc.close();
    }
}
