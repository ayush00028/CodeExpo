import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        System.out.println("Enter element to search: ");
        int key = sc.nextInt();
        int low = 0;
        int high = n - 1;
        int found = -1;
        while (low <= high) 
        {
            int mid = low + (high-low) / 2;
            if (a[mid] == key) 
            {
                found = mid;
                break;
            } 
            else if (key < a[mid]) 
                high = mid - 1;
            else if (key > a[mid])
                low = mid + 1;
        }
        if (found != -1) 
            System.out.println("Element found at index: "+found);
        else 
            System.out.println("Element not found.");
        sc.close();
    }
}