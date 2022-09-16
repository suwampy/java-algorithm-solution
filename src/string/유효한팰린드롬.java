package string;

import java.util.Locale;
import java.util.Scanner;

public class 유효한팰린드롬 {
    private final static Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        String str1 = str.toUpperCase().replaceAll("[^A-Z]", "");
        String str2 = new StringBuilder(str1).reverse().toString();

        return str1.equals(str2) ? "YES" : "NO";
    }

    public static void main(String[] args) {
        유효한팰린드롬 sol = new 유효한팰린드롬();
        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
