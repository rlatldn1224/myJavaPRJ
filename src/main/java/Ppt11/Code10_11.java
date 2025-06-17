package Ppt11;

public class Code10_11 {
    static int a = 100;

    static void method1(){
        int a = 200;
        System.out.println(a);
    }

    static void method2(){
        a = a+1;
        System.out.println(a);
    }
    public static void main(String[] args) {
        method1();
        method2();
    }
}
