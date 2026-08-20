import java.util.Scanner;

public class MatrixMaximumDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of square matrix: ");
        int n = sc.nextInt();

        int[][] arr = new int[n][n];

        System.out.println("Enter elements:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int primarySum = 0;
        int secondarySum = 0;

        for (int i = 0; i < n; i++) {
            primarySum += arr[i][i];
            secondarySum += arr[i][n - 1 - i];
        }

        if (primarySum >= secondarySum) {

            System.out.println("Primary diagonal has maximum value:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][i] + " ");
            }

        } else {

            System.out.println("Secondary diagonal has maximum value:");

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i][n - 1 - i] + " ");
            }
        }
        sc.close();
    }
}