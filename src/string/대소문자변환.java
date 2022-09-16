package string;

import java.util.Scanner;

public class 대소문자변환 {
    private static final Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(Character.toLowerCase(c));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String str = sc.next();
        대소문자변환 sol = new 대소문자변환();
        System.out.println(sol.solution(str));
    }
}
