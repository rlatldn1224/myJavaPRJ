import java.util.Scanner;

public class ExName {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = s.nextLine();

        System.out.print("나이를 입력하세요: ");
        int age = s.nextInt();

        System.out.println("이름:" + name + ", 나이:" + age);

        s.close();



















































    }
}
