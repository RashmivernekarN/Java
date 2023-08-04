//program to find element of sorted array
import java.io.*;
class arrayd 
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[][]=new int[10][10];
        int m,n,i,j;
        System.out.println("Enter the row size:");
        m=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the column size:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Eleements of array:");
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)       
        a[i][j]=Integer.parseInt(stdin.readLine());
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"");
            }
            System.out.println();
       }}}}