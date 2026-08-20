import java.util.*;
public class PivotPoint {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF ARRAY");
        int n=sc.nextInt();
        int[] a = new int[n];

        int totalSum = 0;

        // Find total sum
        for (int i = 0; i < a.length; i++) {
            totalSum += a[i];
        }

        int leftSum = 0;

        for (int i = 0; i < a.length; i++) {

            int rightSum = totalSum - leftSum - a[i];

            if (leftSum == rightSum) {
                System.out.println("Pivot point = " + i);
                break;
            }

            leftSum += a[i];
        }
        sc.close();
    }
}