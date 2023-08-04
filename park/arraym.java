//program to find min & max of array elements
import java.io.*;
class arraym
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[]=new int[100];
        int i,n,max=0,min=0;
        System.out.println("Enter the value of n:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Elements of Array:");
        for(i=0;i<n;i++)       
        a[i]=Integer.parseInt(stdin.readLine());
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
        for(i=0;i<n;i++)
        {
            if(a[i]>max)
                max=a[i];
            if(a[i]<min)
                min=a[i];
        }
    System.out.println("Maximum of array Element:="+max);
    System.out.println("Minimum of array Element:="+min);
    }   }}