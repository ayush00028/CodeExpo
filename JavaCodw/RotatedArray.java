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
