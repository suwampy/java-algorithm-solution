package string;

import java.util.Scanner;

public class 중복문자제거 {
    private final static Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.indexOf(str.charAt(i)) == i) {
                result += str.charAt(i);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        String str = sc.nextLine();
        중복문자제거 sol = new 중복문자제거();
        sol.solution(str);
    }
}
