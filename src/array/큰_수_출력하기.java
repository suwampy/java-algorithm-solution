package array;

import java.util.ArrayList;
import java.util.Scanner;

public class 큰_수_출력하기 {
    private static final Scanner sc = new Scanner(System.in);

    private ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> result = new ArrayList<>();
        result.add(arr[0]);

        for (int i = 1; i<arr.length; i++) {
            if (arr[i-1] < arr[i]) {
                result.add(arr[i]);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        큰_수_출력하기 sol = new 큰_수_출력하기();
        int len = sc.nextInt();
        int[] arr = new int[len];
        for (int i = 0; i < len; i ++) {
            arr[i] = sc.nextInt();
        }
        sol.solution(arr).forEach(s-> System.out.print(s + " "));
    }
}
