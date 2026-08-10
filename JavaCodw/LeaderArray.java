import java.util.*;
public class LeaderArray 
    {
    public static void main(String[] args) 
        {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int[] res = new int[n];
        int count = 0;
        int max = a[n - 1];
        res[count++] = max;
        for(int i = n - 2; i >= 0; i--) 
        {
            if(a[i] > max) {
                max = a[i];
                res[count++] = max;
            }
        }
        for(int i = count - 1; i >= 0; i--)
            System.out.print(res[i] + " ");
        sc.close();
    }
} 