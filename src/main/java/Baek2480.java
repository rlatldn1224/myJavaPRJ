import java.util.Scanner;

public class Baek2480 {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if(a == b && b == c) {
                System.out.println(10000 + a * 1000);
            }else if(a==b||b==c||c==a){

                if(a==b||a==c){
                    System.out.println(1000 + a * 100);
                }
                System.out.println(1000 + a * 100);
            } else{
                int max = Math.max(a, Math.max(b, c));
                System.out.println(max * 100);
            }

            sc.close();
    }
}
