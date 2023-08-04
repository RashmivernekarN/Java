// program to display 10 natural number using while, do while, for.

import java.io.*;
class sumfor
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       int i,n,sum=0;
System.out.println("Enter the value of n");
n=Integer.parseInt(stdin.readLine());
        for(i=1;i<=n;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
        System.out.println("Sum:="+sum);
    }
}