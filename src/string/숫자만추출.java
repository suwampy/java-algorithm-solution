package string;

import java.util.Scanner;

public class 숫자만추출 {
    private final static Scanner sc = new Scanner(System.in);

    private int solution(String str) {
        str = str.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        숫자만추출 sol = new 숫자만추출();
        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
