import java.util.Scanner;

public class Code05_04_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();


        if (num > 100) {
            System.out.println("100보다 작군요. ");
            System.out.println("여기는 참입니다. ");
        } else {
            System.out.println("100보다 크군요. ");
            System.out.println("여기는 거짓입니다. ");
        }

        System.out.println("프로그램 끝!");
    }
}
