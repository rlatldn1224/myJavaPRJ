package Exam;

public class Exam02 {
    public static void main(String[] args) {
        String log = "127.0.0.1 - frank [10/Oct/2000:13:55:36\n" +
                "-0700] \"GET /apache_pb.gif HTTP/1.0\" 200 ";

        int str1 = log.indexOf(" \"");
        int str2 = log.indexOf("/", str1);
        int end = log.indexOf(" ", str2);

        String res = log.substring(str2, end);

        System.out.println(res);

    }
}
