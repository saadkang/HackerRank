package sumarray;

import java.util.Scanner;

/**
 * Created by saadi on 6/7/2017.
 */
public class ArrayElementSum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            sum = sum + (sc.nextInt());
        }
        System.out.println(sum);
    }
}
