package string;

import java.util.ArrayList;
import java.util.Scanner;

public class 단어뒤집기 {
    private static final Scanner sc = new Scanner(System.in);

    private ArrayList<String> solution(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        for (String str : strArr) {
            String tmp = new StringBuilder(str).reverse().toString();
            strList.add(tmp);
        }

        return strList;
    }

    private ArrayList<String> solution2(String[] strArr) {
        ArrayList<String> strList = new ArrayList<>();
        for (String str : strArr) {
            char[] s = str.toCharArray();
            int lt = 0;
            int rt = str.length();

            while (lt < rt) {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
            strList.add(String.valueOf(s));
        }

        return strList;
    }

    public static void main(String[] args) {
        int input = sc.nextInt();
        String[] arr = new String[input];
        for (int i = 0; i <input; i++) {
            arr[i] = sc.next();
        }
        단어뒤집기 sol = new 단어뒤집기();
        for (String s : sol.solution(arr)) {
            System.out.println(s);
        }
    }
}
