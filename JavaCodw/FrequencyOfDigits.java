
import java.util.Scanner;

public class FrequencyOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        n = Math.abs(n);//negative values ke liye
        int val=0;
        if (n == 0) //border condition ke liye
            System.out.println(val);
        int max = 0;
        for (int i = 0; i <= 9; i++) {
            int temp = n;
            int count = 0;
            while (temp > 0)
            {
                if (temp % 10 == i) 
                    {
                        count++;
                    }
                temp /= 10;
            }
            if (count > max)
                {
                    max = count;
                    val=i;
                }
        }
        System.out.println(max+"times");
        System.out.println(val);
        sc.close();
    }
}