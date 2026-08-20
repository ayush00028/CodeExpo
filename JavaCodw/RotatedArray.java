import java.util.*;
public class RotatedArray {
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i,k;
        System.out.println("ENTER THE SIZE OF ARRAY ");
        n=sc.nextInt();
        int[] a = new int[n]; 
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        System.out.println("ENTER THE VALUE OF K:");
        k=sc.nextInt();
        k=k%n;
        int[] res = new int[n];
        for(i=0;i<n;i++)
            res[(i+k)%n]=a[i];
        System.out.println("THE ROTATED ARRAY :");
        for(int j : res)
            System.out.println(j + " ");
        sc.close();
    }
}
// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;

//         k = k % n;

//         // Reverse the whole array
//         reverse(nums, 0, n - 1);

//         // Reverse the first k elements
//         reverse(nums, 0, k - 1);

//         // Reverse the remaining elements
//         reverse(nums, k, n - 1);
//     }

//     public void reverse(int[] nums, int start, int end) {
//         while (start < end) {
//             int temp = nums[start];
//             nums[start] = nums[end];
//             nums[end] = temp;

//             start++;
//             end--;
//         }
//     }
// }