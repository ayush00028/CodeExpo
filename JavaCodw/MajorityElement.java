import java.util.*;
public class MajorityElement
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int i,n;
        System.out.println("ENTER THE SIZE OF ARRAY");
        n=sc.nextInt();
        int[] nums=new int[n];
        System.out.println("ENTER THE ARRAY ELEMENTS :");
        for(i=0;i<n;i++)
            nums[i]=sc.nextInt();
        MajorityElement obj=new MajorityElement();
        int res=obj.majorityElement(nums);
        System.out.println("Majority Element is :"+res);
        sc.close();
    }
    public int majorityElement(int nums[])
    {
        int candidate=0;
        int voteCount=0;
        for(int num : nums)
        {
            if(voteCount == 0)
                candidate=num;
            if(candidate == num)
                voteCount++;
            else 
                voteCount--;
        }
        return candidate;
    }
}