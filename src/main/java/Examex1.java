import java.util.Scanner;

public class Examex1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("정수 a를 입력하세요: ");
        int a = sc.nextInt();

        System.out.print("정수 b를 입력하세요: ");
        int b = sc.nextInt();

        double result = (double) a / b;
        System.out.println("결과: " + result);

        sc.close();
    }
}
