package string;

import java.util.Scanner;

public class 특정문자뒤집기 {
    private static final Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        char[] s = str.toCharArray();

        int lt = 0;
        int rt = str.length() - 1;

        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt])) {
                lt++;
            } else if (!Character.isAlphabetic(s[rt])) {
                rt--;
            } else {
                char temp = s[lt];
                s[lt] = s[rt];
                s[rt] = temp;

                lt++;
                rt--;
            }
        }

        return String.valueOf(s);
    }
    public static void main(String[] args) {
        String str = sc.nextLine();
        특정문자뒤집기 sol = new 특정문자뒤집기();
        System.out.println(sol.solution(str));
    }
}
