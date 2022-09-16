package string;

import java.util.Scanner;

public class 가장짧은문자거리 {
    private final static Scanner sc = new Scanner(System.in);

    private int solution(String str) {
        str = str.toUpperCase().replaceAll("[A-Z]", "");
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        가장짧은문자거리 sol = new 가장짧은문자거리();
        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
