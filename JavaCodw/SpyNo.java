import java.util.*;
public class SpyNo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,d;
        System.out.println("ENTER THE NUMBER TO BE CHECKED");   
        n=sc.nextInt();
        int temp=n;
        int sum=0;
        int prod=1;
        while(temp!=0)
        {
            d=temp%10;
            sum+=d;
            prod*=d;
            temp/=10;
        }
        if(sum==prod)
            System.out.println("THE ENTERED NUMBER IS A SPY NUMBER ");
        else
            System.out.println("THE ENTERED NUMBER IS NOT A SPY NUMBER");
        sc.close();
    }
}