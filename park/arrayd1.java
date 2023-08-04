//program to find element of sorted array
import java.io.*;
class arrayd1 
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[][]=new int[10][10];
        int m,n,i,j,sum=0,avg=0;
        System.out.println("Enter the value of m:");
        m=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the value of n:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the systems of array:");
        for(i=0;i<n;i++)
        for(j=0;j<m;j++)       
        a[i][j]=Integer.parseInt(stdin.readLine());
        System.out.println(" Elements of array are:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.println(a[i][j]+"");
            }
            System.out.println();
       }
       for (i=0;i<m;i++)
        for(j=0;j<n;j++)
            sum=sum+a[i][j];
        avg=sum/(m*n);
        System.out.println("sum="+sum);
        System.out.println("avg="+avg);
    }}}