import java.util.Scanner;

public class Baek10101 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 + n2 + n3 != 180 ){
            System.out.println("Error");
            return;
        }
        if (n1 == 60 && n2 == 60 &&  n3 == 60)  {
            System.out.println("Equilateral");
        } else if (n1 == n2 || n1 == n3 || n2 == n3 ){
            System.out.println("Isosceles");
        }    else {
            System.out.println("Scalene");
        }
    }
}
