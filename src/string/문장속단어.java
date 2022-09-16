package string;

import java.util.Scanner;

public class 문장속단어 {
    private static final Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        String result = "";
        int m = Integer.MIN_VALUE;
        int pos;
        while ((pos = str.indexOf(' ')) != -1) {
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if (len > m) {
                m = len;
                result = tmp;
            }
            str = str.substring(pos+1);
        }

        if (str.length() > m) result = str;

        return result;
    }

    public static void main(String[] args) {
        String str = sc.nextLine();
        문장속단어 sol = new 문장속단어();
        System.out.println(sol.solution(str));
    }
}
