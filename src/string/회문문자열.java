package string;

import java.util.Locale;
import java.util.Scanner;

public class 회문문자열 {
    private final static Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        String str1 = str.toLowerCase(Locale.ROOT);
        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equals(str2) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        회문문자열 sol = new 회문문자열();
        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
