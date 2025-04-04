public class Test01 {

    public static void main(String[] args) {

        String log = "127.0.0.1 - Scott [10/Dec/2019:13:55:36 -0700] \"GET /server-status HTTP/1.1\" 200 232";

        int idx = log.indexOf("\"");
        int idx2 = log.indexOf(" ", idx);

        String result = log.substring(idx+1,idx2);

        System.out.println(result);
    }
}
