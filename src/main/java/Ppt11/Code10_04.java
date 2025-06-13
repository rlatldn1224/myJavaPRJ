package Ppt11;

public class Code10_04 {
    static int static_para2_method(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    public int para2_method(int v1, int v2) {
        int result;
        result = v1 + v2;
        return result;
    }

    public static void main(String[] args) {

        int hap;
        hap = static_para2_method(10, 20);
        System.out.println("매개변수 2개 메서드 호출 결과 : " + hap);

        int hap2;
        Code10_04 a = new Code10_04();
        hap2 = a.para2_method(10, 20);

        System.out.println(hap2);

    }
}

