package string;

import java.util.Scanner;

public class 문자열압축 {
    private final static Scanner sc = new Scanner(System.in);

    private String solution(String str) {
        String result = "";
        int count = 1;
        for (int i = 0; i <str.length() ; i++){
            if (str.indexOf(str.charAt(i)) == i) {
                if (count > 1) {
                    result += count;
                }
                result += str.charAt(i);
                count = 1;
            } else {
                count++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        문자열압축 sol = new 문자열압축();
        String str = sc.nextLine();
        System.out.println(sol.solution(str));
    }
}
