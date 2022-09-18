package array;

import java.util.Scanner;

public class 뒤집은소수 {
    private static final Scanner sc = new Scanner(System.in);

    private static int[] solution(int n, int[] arr) {
        int[] result = new int[n];

        for (int i : arr) {
            System.out.println(i);
        }

        return result;
    }

    public static void main(String[] args) {
        int n = sc.nextInt();
        sc.next();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++){
            String input = sc.nextLine();
            arr[i] = Integer.parseInt(new StringBuilder(input).reverse().toString());
        }

        solution(n, arr);
    }
}
