import java.util.*;
public class RotatedSortedArray 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n,count=0;
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        n=sc.nextInt();
        int[] a=new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(i=0;i<a.length;i++)
            a[i]=sc.nextInt();
        for(i=0;i<a.length;i++)
        {
            if(a[i]>a[(i+1)%n])
                count++;
        }
        if(count<=1)
        System.out.println("IT IS AN ROTATED SORTED ARRAY");
        else
        System.out.println("IT IS NOT AN ROTATED SORTED ARRAY");
    sc.close();
    }    
}//Search in RotatedSortedArray
// class Solution {
//     public int search(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 return mid;
//             }

//             // Left half is sorted
//             if (nums[low] <= nums[mid]) {

//                 if (nums[low] <= target && target < nums[mid]) {
//                     high = mid - 1;
//                 } 
//                 else {
//                     low = mid + 1;
//                 }
//             }

//             // Right half is sorted
//             else {

//                 if (nums[mid] < target && target <= nums[high]) {
//                     low = mid + 1;
//                 } 
//                 else {
//                     high = mid - 1;
//                 }
//             }
//         }

//         return -1;
//     }
// }