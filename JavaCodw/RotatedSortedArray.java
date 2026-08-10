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
}
