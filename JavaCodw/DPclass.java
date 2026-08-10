import java.util.Scanner;
public class DPclass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,rev=0,n;
        System.out.println("ENTER THE NUMBER TO BE REVERSED");
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }
        System.out.println("THE REVERSE OF THE NUMBER IS ="+rev);
        sc.close();
    }
    
}
