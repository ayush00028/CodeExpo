import java.util.Scanner;
public class SwapAdjacentElement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        for (int i = 0; i < a.length - 1; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }
        System.out.print("Swapped Array: ");
        for (int num : a) {
            System.out.print(num + " ");
        }
        sc.close();
    }
}