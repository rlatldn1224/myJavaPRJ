public class Testt01 {

    public static void main(String[] args) {


        String str = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";

        System.out.println(str.indexOf("\""));
        System.out.println(str.indexOf(" /"));

        String result = str.substring(48,51);
    }
}
