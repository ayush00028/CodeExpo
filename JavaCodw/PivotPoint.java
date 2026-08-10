import java.util.*;

public class PivotPoint 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n,i;
        n=sc.nextInt();
        int[] a=new int[n];
        long Total=0;
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
            Total+=a[i];
        }
         long Left=0,Right=0;
        for(i=0;i<n;i++)
        {
            Right=Total - Left - a[i];
            if(Left == Right)
            {
                System.out.println(i);
                return;
            }
            Left+=a[i];
        }
        System.out.println("-1");
        sc.close();
    }
}