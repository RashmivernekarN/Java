import java.io.*;
class array1
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[]=new int[100];
        int i,n;
        System.out.println("Enter the limit:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Elements of Array:");
        for(i=0;i<n;i++)       
        a[i]=Integer.parseInt(stdin.readLine());
        System.out.println("Array Elements are:");
        for(i=0;i<n;i++)
        System.out.println(a[i]);
    }
}}