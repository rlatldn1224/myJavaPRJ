import java.util.Scanner;

public class SunUpToNEx {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("n을 입력하세요: ");
        int n = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("1부터" + n + "까지의 합: " + sum);
    }
}
