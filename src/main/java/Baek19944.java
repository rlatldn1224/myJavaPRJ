import java.util.Scanner;

public class Baek19944 {

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        int N = se.nextInt();
        int M = se.nextInt();

        if (M == 1 || M == 2 ){
            System.out.println("NEWBIE!");
        } else if (M<=N){
            System.out.println("OLDBIE!");
        } else{
            System.out.println("TLE!");
        }
    }
}
