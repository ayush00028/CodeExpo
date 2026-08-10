import java.util.*;

public class PerfectSeatAssignment {

    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] a=new int[n];
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        long target=sc.nextLong();
        int high=n-1;
        int low=0;
        int ans=n;
        while(low<=high)
        {
            int mid=low+(high - low)/2;
            if(a[mid]>=target)
            {
                ans=mid;
                high=mid-1;
            }
            else
                low=mid+1;
        }
        System.out.println(ans);
        sc.close();
    }
}