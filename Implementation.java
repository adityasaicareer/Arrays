import java.util.*;
public class Implementation
{
    public static int linearsearch(int[] arr,int s)
    {
        int l=arr.length;
        for(int i=1;i<=l;i++)
        {
            if(arr[i-1]==s)
            {
                return i-1;
            }
        }
        return -1;

    }

    public static int binarysearch(int arr[],int s,int l,int h)
    {
        
        int mid=(h+l)/2;
        System.out.println(mid);
        if(s>arr[arr.length-1]||s<arr[0])
        {
            return -1;
        }
    
        if(arr[mid]==s)
        {
            System.out.println("found at index "+mid);
            return mid;
        }
        else if(arr[mid]>s)
        {
            h=mid;
            binarysearch(arr,s,l,h);
        }
        else if(arr[mid]<s)
        {
            l=mid;
            binarysearch(arr,s,l,h);
        }
        
        return -1;
        


    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of the array:");
        int n=sc.nextInt();
        int arr[]=new int[n];

        for(int i=1;i<=n;i++)
        {
            arr[i-1]=sc.nextInt();
        }

        // to print the values of the array

        for(int i:arr)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        // linear Search

        System.out.print("Enter the value to be searched:");

        int s=sc.nextInt();

        int res=linearsearch(arr,s);
        if(s==-1)
        {
            System.out.println("Not found");
        }
        else{
            System.out.println("Found at index "+res);
        }
       
       System.out.println(binarysearch(arr,s,0,arr.length));
        sc.close();


    }
}