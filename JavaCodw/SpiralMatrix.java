import java.util.*;
class SpiralMatrix 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER NUMBER OF ROWS");
        int row=sc.nextInt();
        System.out.println("ENTER NUMBER OF COLUMNS");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        System.out.println("ENTER THE MATRIX ELEMENTS");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                matrix[i][j]=sc.nextInt();
            }
        }
        SpiralMatrix object=new SpiralMatrix();
        List<Integer> res=object.spiralOrder(matrix);
        System.out.println(res);
        sc.close();
    }
    public List<Integer> spiralOrder(int[][] matrix) 
    {
        List<Integer> ans = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length-1;
        int left = 0;
        int right =matrix[0].length-1;
        int i;
        while(top<=bottom && left<=right)
        {
            for(i=left;i<=right;i++)
                ans.add(matrix[top][i]);
            top++;
            for(i=top;i<=bottom;i++)
                ans.add(matrix[i][right]);
            right--;
            if(top<=bottom)
            {
                for(i=right;i>=left;i--)
                    ans.add(matrix[bottom][i]);
            }
            bottom--;
            if(left<=right)
            {
                for(i=bottom;i>=top;i--)
                    ans.add(matrix[i][left]);
            }
            left++;
        }
        return ans;
    }
}