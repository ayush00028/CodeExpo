import java.util.*;
public class ArmstrongNo
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n,c=0;
        int sum=0;
        System.out.println("ENTER A NUMBER");
        n=sc.nextInt();
        int temp1=n;
        int temp2=n;
        while(temp1!=0)
        {
            temp1/=10;
            c++;
        }
        while(temp2!=0)
        {
            int d=temp2%10;
            sum+=(int)Math.pow(d,c);
            temp2/=10;
        }
        if(n==sum)
            System.out.println("THE ENTERED NUMBER IS AN ARMSTRONG NUMBER");
        else
            System.out.println("THE ENTERED NUMBER IS NOT AN ARMSTRONG NUMBER");
        sc.close();
    }
}