import java.util.Scanner;
public class StringSort
{
    public static void main(String[] args)
    {
        String temp;
        Scanner obj= new Scanner(System.in);
        System.out.print("Enter the number of strings:");
        int n=obj.nextInt();
        String number[]=new String[n];
        System.out.println("Enter the strings:");
        for(int i=0;i<n;i++)
        {
            number[i]=obj.next();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(number[i].compareTo(number[j])<0)
                {
                    temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println("Strings after sorting:");
        for(int i=0;i<n;i++)
        {
            System.out.println(number[i]);
        }
    }
}
