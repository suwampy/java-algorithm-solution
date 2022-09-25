package array;

import java.util.Scanner;

public class 봉우리 {

    private static final Scanner sc = new Scanner(System.in);

    private static int sol (int n, int[][] arr){
        int[] dx = {-1, 0, 1, 0}; // 좌 우 이동
        int[] dy = {0, 1, 0, -1}; // 상 하 이동

        int result = 0;

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                boolean flag = true;
                for(int k =0; k<4; k++){
                    int nx = i + dx[k];
                    int ny = j + dy[k];

                    if (nx >=0 &&
                    ny>=0 &&
                    nx < n &&
                    ny < n &&
                    arr[nx][ny] >= arr[i][j]) {
                        flag = true;
                        break;
                    }
                }

                if(flag) {
                    result++;
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0; i<n ; i++) {
            arr[0][i] = 0;
            for(int j = 0; j<n; j++) {
                arr[i][0] = 0;
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(sol(n, arr));
    }
}
