package array;

import java.util.Scanner;

public class 점수계산 {
    private static final Scanner sc = new Scanner(System.in);

    private static int solution(int n, int[] arr) {
        int result = 0;
        int seq = 0;
        for (int i : arr) {
            if (i == 0) {
                seq = 0;
            } else {
                seq++;
            }
            result+=seq;
        }

        return result;
    }

    public static void main(String[] args) {
        // 답 맞으면 1 틀리면 0
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
