#include <iostream>

using namespace std;

int maxx(int arr[], int n, int i, int max)
{
    int l = n;
    if(i<l)
    {
        if(arr[i]>max)
        {
          
            return maxx(arr, n, i+1, arr[i]);
        }
        else {
            return maxx(arr, n, i+1, max);
        }
    }
    else {
        return max;
    }
}

int main()
{
    cout<<"Enter the number of elements:";
    int n;cin>>n;
    int arr[n];
    for(int i=1;i<=n;i++)
    {
        cin>>arr[i-1];
    }
    cout<<maxx(arr,n,0,arr[0]);
    
}
