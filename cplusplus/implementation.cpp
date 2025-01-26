#include <iostream>

using namespace std;

int linearsearch(int arr1[],int s,int l)
{
    
    for(int i=1;i<=l;i++)
    {

        if(arr1[i-1]==s)
        {
            return i-1;
        }

    }
    return -1;
}
int main()
{
    cout<<"Enter the number of input:";
    int n;cin>>n;
    int arr[n];
    for(int i=1;i<=n;i++)
    {
        cin>>arr[i-1];
    }
    // output of the array

    for(int i=1;i<=n;i++)
    {
        cout<<arr[i-1]<<" ";
    }
    cout<<endl;

    // linear search
    cout<<"Enter the number to find:";
    int s;
    cin>>s;

    int res=linearsearch(arr,s,n);
    if(res==-1)
    {
        cout<<"the element was not found in the array"<<endl;
    }
    else{
        cout<<"the element was found in array at "<<res<<endl;
    }

    // binary search
    int l=0;
    int h=n;
    for(int i=1;i<=n;i++)
    {
        int mid=(l+h)/2;
        if(arr[mid]>s)
        {
            h=mid;

        }
        else if(arr[mid]<s)
        {
            l=mid;
        }
        else if(arr[mid]==s)
        {
            cout<<"found at index "<<mid<<endl;
            break;
        }
    }


}