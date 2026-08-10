import java.util.Scanner;

public class HappyNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int temp = n;

        while (temp != 1 && temp != 4) {

            int sum = 0;

            while (temp > 0) {
                int digit = temp % 10;
                sum = sum + (digit * digit);
                temp = temp / 10;
            }

            temp = sum;
        }

        if (temp == 1)
            System.out.println(n + " is a Happy Number");
        else
            System.out.println(n + " is Not a Happy Number");

        sc.close();
    }
}