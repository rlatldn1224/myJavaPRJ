import java.util.Scanner;

public class FindMaxNum {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("세 개의 정수를 입력하세요: ");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        int max = num1;
        if (num2 > max) {
            max = num2;
        }
        if (num3 > max) {
            max = num3;
        }
        System.out.println("가장 큰 수는: " + max);

        s.close();
    }
}
