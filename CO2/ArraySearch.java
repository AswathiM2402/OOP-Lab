import java.util.Scanner;
class ArraySearch
{
    int [] a;
    void ReadArray()
    {
        a=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the elements:");
        for(int i=0;i<5;i++)
        {
            a[i]=sc.nextInt();
        }
    }
    void PrintArray()
    {
        System.out.println("Array elements are:");
        for(int i:a)
        System.out.println(i);
    }
    void SearchArray()
    {
        int b,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the element you want to find:");
        b = sc.nextInt();
        for(i=0;i<5;i++)
        {
            if(a[i]==b)
            {
                flag=1;
                break;
            }
            else
            {
                flag=0;
            }
        }
        if(flag==1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
    public static void main(String[] args)
    {
        ArraySearch obj = new ArraySearch();
        obj.ReadArray();
        obj.PrintArray();
        obj.SearchArray();
    }
}

