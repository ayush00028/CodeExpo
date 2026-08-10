
import java.util.Scanner;

public class Sample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i;
        System.out.println("enter the size of array");
        n=sc.nextInt();
        int[] a=new int[n];
//         int rot=r%n;
//         for(i=0;i<n;i++)
//             a[i]=sc.nextInt();
//         System.out.println("no of times of rotation ");
//         int r=sc.nextInt();
//         int temp=a[n-1];
//         for(i=n;i>=0;i--)
//            { 
//             // int temp2=a[i+r];
//             a[i]=a[i-r];
//             // a[i]=temp2;

//             // if(i==n)
//             //     break;
//             }
//         a[0]=temp;
//         for(i=0;i<n;i++)
//             System.out.println(a[i]);
//         sc.close();
//     }
// }
  for(i=0;i<n;i++)
     a[i]=sc.nextInt();
    int c=0;
    for(i=n-1;i<=0;i--)
    {
        if(a[i]>a[i-1])
            c=0;
        else
            c=c+1;
    }
    if(c==1)
        System.out.println("IT IS AN ROTATED SORTED ARRAY");
    else
        System.out.println("IT IS NOT AN ROTATED SORTED ARRAY");
    sc.close();
    }
}