import java.util.*;
public class Max{
    public static void main(String args[])
    {   
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of N:");
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        int max=arr[0];
        for(int i=1;i<=n;i++)
        {
            if(arr[i-1]>max)
            {
                max=arr[i-1];
            }
        }

        System.out.printf("The Maximum in the array is %d",max);
    }
}