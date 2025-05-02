package Exam;

public class Exam01 {
    public static void main(String[] args){
        int t=4;

        for(int i = 0; i < t; i++){
            for(int j =0; j<t-i-1; j++){
                System.out.print(" ");
            }
            for (int k =0; k< i*2+1 ; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
