import java.util.*;
public class MissingNumber 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,i;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int expectedSum = n*(n+1)/2;
        int actualSum = 0;
        for(int num : a)
            actualSum+=num;
        int missing=expectedSum - actualSum;
        System.out.println("Missing Number = "+ missing);
        sc.close();
    }
}
