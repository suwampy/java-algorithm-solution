package array;

import java.util.Scanner;

public class 등수구하기 {
    private static final Scanner sc = new Scanner(System.in);

    private static int[] solution(int n, int[] arr) {
        int[] result = new int[n];
        for (int i : arr) {
            int cnt = 1;
            for (int j : arr){
                if(arr[j] > arr[i]) {
                    cnt++;
                }
                result[i] = cnt;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr=new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(solution(n, arr));
    }
}
