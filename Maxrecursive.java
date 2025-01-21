import java.util.*;
public class Maxrecursive {

    public static int maxx(int arr[],int i,int max)
    {
        if(i<arr.length)
        {
            if(arr[i]>max)
            {
                return maxx(arr,i+1,arr[i]);
            }
            else{
                return maxx(arr,i+1,max);
            }
        }
        else{
            return max;
        }
    }

    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.printf("The Number od input :");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        System.out.println("The maxmum is "+maxx(arr,0,arr[0]));

        sc.close();

    }
    
}
