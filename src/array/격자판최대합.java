package array;

import java.util.Scanner;

public class 격자판최대합 {
    private static final Scanner sc = new Scanner(System.in);

    private static int sol(int n, int[][] arr) {
        int result = 0;

        int sum1 = 0; // 가로 합
        int sum2 = 0; // 세로합

        for (int i = 0; i<n; i ++) {
            sum1 = 0;
            sum2 = 0;
            for (int j = 0; j<n; j++) {
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }

            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        // 대각선
        sum1 = 0;
        sum2 = 0;
        for (int i =0; i<n; i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        result = Math.max(result, sum1);
        result = Math.max(result, sum2);

        return result;
    }
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i =0; i< n; i++){
            for (int j =0; j< n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(sol(n, arr));
    }
}
