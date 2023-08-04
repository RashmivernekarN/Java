// program to display Factorial of a number using while, do while, for.

import java.io.*;
class factfor
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       int i=1,n,f=1;
System.out.println("Enter the value of n");
n=Integer.parseInt(stdin.readLine());
        for(i=1;i<=n;i++)
        {
            f=f*i;
            System.out.println(i);
        }
        System.out.println("Factorial of a Number:="+f);
    }
}