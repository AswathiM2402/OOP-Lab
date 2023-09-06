import java.util.Scanner;
class symmetric
{
public static void main(String args[])
{
int x,y;
int count=0;
Scanner sc=new Scanner(System.in);
System.out.print("Enter the number of rows: ");
x=sc.nextInt();
System.out.print("Enter the number of columns: ");
y=sc.nextInt();
int[][] A=new int [20][20];
System.out.println("Enter the elements ");
for(int i=0;i<x;i++)
for(int j=0;j<y;j++)
A[i][j]=sc.nextInt();
System.out.println("Matrix elements are ");
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
System.out.print(A[i][j]+" ");
}
System.out.println(" ");
}
int[][] B=new int[20][20];
for(int i=0;i<x;i++)
for(int j=0;j<y;j++)
{
B[j][i]=A[i][j];
}
System.out.println("Matrix after transpose ");
for(int i=0;i<y;i++)
{
for(int j=0;j<x;j++)
{
System.out.print(B[i][j]+" ");
}
System.out.println(" ");
}
if(x!=y)
{
System.out.println("Both matrix and its transpose must want same size to check whether the matrix is symmetric or not ");
}
else
{
for(int i=0;i<x;i++)
{
for(int j=0;j<y;j++)
{
if(A[i][j]!=B[i][j])
{
count=count+1;
break;
}
}
}
if(count==0)
{
System.out.println("Matrix is symmetric");
}
else
{
System.out.println("Matrix is not symmetric");
}
}
}
}