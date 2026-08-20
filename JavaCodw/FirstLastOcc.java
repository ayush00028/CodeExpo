public class FirstLastOcc {
    
    public int[] searchRange(int[] nums, int target) {

        int first = findFirst(nums, target);
        int last = findLast(nums, target);

        return new int[]{first, last};
    }

    public int findFirst(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;      // Search on left side
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }

    public int findLast(int[] nums, int target) {

        int low = 0;
        int high = nums.length - 1;
        int ans = -1;

        while (low <= high) {

            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;      // Search on right side
            }
            else if (nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return ans;
    }
}
// import java.util.*;
// public class Solution {
//     public static void main(String[] args)
// {
//     Scanner sc = new Scanner(System.in);
//     int n = sc.nextInt();
//     int[] arr = new int[n];
//     for(int i = 0; i < n; i++) {
//         arr[i] = sc.nextInt();
//     }
//     int target = sc.nextInt();
//     Solution obj = new Solution();
//     int[] result = obj.searchRange(arr, target);
//     System.out.println(result[0] + " " + result[1]);
//     sc.close();
// }
//     public int[] searchRange(int[] nums, int target) {

//         int first = findFirst(nums, target);
//         int last = findLast(nums, target);

//         return new int[]{first, last};
//     }

//     public int findFirst(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;
//         int ans = -1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 ans = mid;
//                 high = mid - 1;      // Search on left side
//             }
//             else if (nums[mid] < target) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         return ans;
//     }

//     public int findLast(int[] nums, int target) {

//         int low = 0;
//         int high = nums.length - 1;
//         int ans = -1;

//         while (low <= high) {

//             int mid = low + (high - low) / 2;

//             if (nums[mid] == target) {
//                 ans = mid;
//                 low = mid + 1;      // Search on right side
//             }
//             else if (nums[mid] < target) {
//                 low = mid + 1;
//             }
//             else {
//                 high = mid - 1;
//             }
//         }

//         return ans;
//     }
// }