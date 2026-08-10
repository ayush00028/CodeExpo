import java.util.Scanner;
public class DPclass2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d,lar=0,n;
        System.out.println("ENTER THE NUMBER ");
        n=sc.nextInt();
        while(n!=0)
        {
            d=n%10;
            if(d>lar)
                lar=d;
            n=n/10;
        }
        System.out.println("THE LARGEST DIGIT OF THE NUMBER IS ="+lar);
        sc.close();
    }
    
}

