import java.util.Scanner;

public class EvenAndOdd {

    public static void main(String[] args) {

        Scanner Scanner = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int number = Scanner.nextInt();

        if (number % 2 ==0) {
            System.out.println(number + "is even:");
        } else {
            System.out.println(number + "is odd:");
        }


    }
}
