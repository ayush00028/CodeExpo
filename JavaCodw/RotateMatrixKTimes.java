import java.util.Scanner;

public class RotateMatrixKTimes {
    public static void Rotate(int[][] arr,int k)
    {
        int n=arr.length;
        int Loop;
    for(Loop=0;Loop<=k;Loop++)
        {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;

            }
        }
        for (int i = 0; i < n; i++) {
            int left = 0;
            int right = n - 1;
            while (left < right) {
                int temp = arr[i][left];
                arr[i][left] = arr[i][right];
                arr[i][right] = temp;

                left++;
                right--;
            }
        }
    }
    System.out.println("Matrix after clockwise rotation:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        System.out.println("Enter matrix:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("enter the number of times the matrix must be rotated");
        int k=sc.nextInt();
        k=k%4;
        Rotate(arr,k);
        sc.close();
    }
}

