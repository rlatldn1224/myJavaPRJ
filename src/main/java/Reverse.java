import java.util.Scanner;

public class Reverse {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("문자열을 입력하세요: ");
        String input = scanner.nextLine();

        String reversed = new StringBuilder(input).reverse().toString();
        System.out.println("뒤집은 문자열: " + reversed);

    }
}
