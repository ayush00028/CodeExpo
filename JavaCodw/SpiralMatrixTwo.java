import java.util.*;
public class SpiralMatrixTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER :");
        int n=sc.nextInt();
        SpiralMatrixTwo obj = new SpiralMatrixTwo();
        int[][] result=obj.generateMatrix(n);
        System.out.println("Generated Matrix:");
        for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                    {
                    System.out.print(result[i][j] + " ");
                    }
            System.out.println();
            }
        sc.close();
    }
    public int[][] generateMatrix(int n) {
        int[][] arr=new int[n][n];
        int top = 0;
        int bottom = n-1;
        int left = 0;
        int right = n-1;
        int i;int num=1;
        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
                arr[top][i] = num++;
            top++;
            for(i=top;i<=bottom;i++)
                arr[i][right] = num++;
            right--;
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                    arr[bottom][i] = num++;
            }
            bottom--;
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                    arr[i][left] = num++;
            }
            left++;
        }
        return arr;
    }
}
