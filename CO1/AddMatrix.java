import java.util.Scanner;
class AddMatrix
{
    public static void main(String args[])
    {
        int row,col,i,j;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        row=in.nextInt();
        System.out.println("Enter the number of columns:");
        col=in.nextInt();
        int mat1[][]=new int[row][col];
        int mat2[][]=new int[row][col];
        int sum[][]=new int[row][col];
        System.out.println("Enter the elements of first matrix:");
        for (i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            mat1[i][j]=in.nextInt();
            System.out.println();
        }
        
        System.out.println("Enter the elements of second matrix:");
        for (i=0;i<row;i++)
        {
            for (j=0;j<col;j++)
            mat2[i][j]=in.nextInt();
            System.out.println();
        }
        System.out.println("First matrix is:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat1[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println("Second matrix is:");
        for(i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(mat2[i][j]+" ");
            }
            System.out.println(" ");
        }
        for (i=0;i<row;i++)
        for (j=0;j<col;j++)
        sum[i][j] = mat1[i][j] + mat2[i][j];
        System.out.println("Sum of matrices:");
        for (i=0;i<row;i++)
        {
            for(j=0;j<col;j++)
            {
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println(" ");
        }
    }
}
