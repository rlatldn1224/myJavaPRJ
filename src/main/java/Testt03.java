public class Testt03 {

    public static void main(String[] args) {

        int n = 7;

        for (int i = 0; i < n; i++) {
            if (i < n / 2){

                for (int j = 0; j <= i; j++) {
                    System.out.print("*");
                }
            }

            else {
                for (int j = n -1; j >= i; j--) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
