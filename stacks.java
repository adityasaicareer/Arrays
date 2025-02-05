class mystack{
    int arr[];
    int ind;
    public mystack(int n)
    {
        arr=new int[n];
        ind=0;
    }

    void push(int v)
    {
        if(ind<arr.length)
        {
            arr[ind]=v;
            ind=ind+1;
        }
        else{
            System.out.println("Overflow");
        }
    }
    int pop()
    {
        if(ind>=0)
        {
            return arr[ind--];
        }
        else{
            System.out.println("overflow");
            return -1;
        }
        
    }

    void display()
    {
        for(int i=1;i<=ind;i++)
        {
            System.out.println(arr[i-1]);
        }
    }
}
public class stacks
{
    public static void main(String args[])
    {
        mystack m=new mystack(10);
        m.push(1);
        m.push(2);
        m.push(3);
        m.push(4);
        m.push(5);

        m.display();
        m.pop();
        m.pop();
        System.out.println("----------");
        m.display();
    }
}