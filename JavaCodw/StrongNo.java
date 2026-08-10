import java.util.*;
public class StrongNo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,d;
        System.out.println("ENTER THE NUMBER TO BE CHECKED");
        n=sc.nextInt();
        int copy=n;
        int i,fact=1;
        int sum=0;
        while(copy!=0)
        {
            d=copy%10;
            fact=1;
            for(i=1;i<=d;i++)
                fact=fact*i;
            sum+=fact;
            copy/=10;
        }
        if(sum==n)
        System.out.println("THE ENTERED NUMBER IS A STRONG NUMBER");
        else 
            System.out.println("THE ENTERED NUMBER IS NOT A STRONG NUMBER");
        sc.close();    
    }
}