import java.util.*;
public class GreaterThanAverage 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SIZE OF THE ARRAY:");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("ENTER ARRAY ELEMENTS:");
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        int sum = 0;

        for (int num : a) {
            sum += num;
        }

        double avg = (double) sum / a.length;

        System.out.println("Average = " + avg);

        System.out.print("Elements greater than average: ");

        for (int num : a) {
            if (num > avg) {
                System.out.print(num + " ");
            }
        }
        sc.close();
    }
}