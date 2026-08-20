import java.util.Scanner;

public class SearchMatrixElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.print("Enter element to search: ");
        int target = sc.nextInt();

        boolean found = false;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {

                if (arr[i][j] == target) {
                    System.out.println("Element found at index: [" + i + "][" + j + "]");
                    found = true;
                    break;
                }
            }

            if (found) {
                break;
            }
        }

        if (!found) {
            System.out.println("Element not found");
        }
        sc.close();
    }
}