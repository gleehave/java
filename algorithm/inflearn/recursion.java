package algorithm.inflearn;

public class recursion {
    public static int length(String str) {
        if (str.equals("")) {
            return 0;
        } else {
            return 1 + length(str.substring(1));
        }
    }

    public static void main(String[] args) {
        String data = "abcdef";
        System.out.println(length(data));
    }
}
