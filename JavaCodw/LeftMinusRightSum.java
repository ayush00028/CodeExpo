import java.util.*;

public class LeftMinusRightSum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int[] res = new int[n];

        // Calculate total sum
        int rsum = 0;

        for (int i = 0; i < n; i++) {
            rsum += a[i];
        }

        int lsum = 0;

        for (int i = 0; i < n; i++) {

            rsum = rsum - a[i];

            res[i] = Math.abs(lsum - rsum);

            lsum = lsum + a[i];
        }

        for (int num : res) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}