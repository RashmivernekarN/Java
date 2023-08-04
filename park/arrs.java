//program to find sum&avg of array elements
import java.io.*;
class arrs
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[]=new int[100];
        int i,n,sum=0,avg=0;
        System.out.println("Enter the value of n:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Elements of Array:");
        for(i=0;i<n;i++)       
        a[i]=Integer.parseInt(stdin.readLine());
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        {
        System.out.println(a[i]);
        sum=sum+a[i];
    }
    avg=sum/n;
    System.out.println("Sum:="+sum);
        System.out.println("Average:="+avg);
}   }}