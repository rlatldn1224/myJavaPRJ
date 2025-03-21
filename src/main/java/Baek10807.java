import java.util.Scanner;

public class Baek10807 {
    public static void main(String[] args) {
        // Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        // 첫 번째 입력: n (배열의 크기)
        int n = sc.nextInt();

        // 두 번째 입력: 배열 a (n개의 정수)
        int[] a = new int[n];

        // 배열에 값 입력 받기
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // 세 번째 입력: 찾을 숫자 x
        int x = sc.nextInt();

        // x의 개수를 셀 변수
        int count = 0;

        // 배열에서 x의 개수 세기
        for (int i = 0; i < n; i++) {
            if (a[i] == x) {
                count++;  // 일치하면 카운트 증가
            }
        }

        // 결과 출력
        System.out.println(count);

        // Scanner 객체 종료
        sc.close();
    }
}