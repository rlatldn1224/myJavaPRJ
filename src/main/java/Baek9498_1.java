import java.util.Scanner;

public class Baek9498_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        if (89 < num && num < 101) {
            System.out.println("A");
        } else if (79 < num && num < 90) {
            System.out.println("B");
        } else if (69 < num && num < 80) {
            System.out.println("C");
        } else if (59 < num && num < 70) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}

