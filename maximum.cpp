#include <iostream>

using namespace std;

int main()
{
    cout<<"The number of elements:";
    int n;
    cin>>n;
    int arr[n];
    for(int i=1;i<=n;i++)
    {
        cin>>arr[i-1];
    }

    int max=arr[0];
    for(int i=1;i<=n;i++)
    {
        if(arr[i-1]>max)
        {
            max=arr[i-1];
        }
    }

    cout<<"the maximum of the array is "<<max<<endl;
}