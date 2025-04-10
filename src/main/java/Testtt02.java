import java.util.Scanner;

public class Testtt02 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i=0; i < n; i++){
            if(i < n / 2){
                for(int j=0; j <= i; j++){
                    System.out.print("*");
                }
            }
            else{
                for(int j= n-1; j >= i; j--){
                    System.out.print("*");
                }
            }
            System.out.println();
            sc.close();
        }
    }
}
