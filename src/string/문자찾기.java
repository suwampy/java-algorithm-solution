package string;
import java.util.Scanner;

public class 문자찾기 {
    private static final Scanner sc = new Scanner(System.in);

    private int solution(String str, char t) {
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);

        for (char x : str.toCharArray()) {
            if (x == t) {
                answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        String str = sc.next();
        char c = sc.next().charAt(0);
        문자찾기 sol = new 문자찾기();

        System.out.println(sol.solution(str, c));

    }
}
