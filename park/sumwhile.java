// program to display 10 natural number using while, do while, for.

import java.io.*;
class sumwhile
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       int i=1,n,sum=0;
System.out.println("Enter the value of n");
n=Integer.parseInt(stdin.readLine());
        while(i<=n)
                {
            System.out.println(i);
            sum=sum+i;
            i++;
        }
                System.out.println("Sum:="+sum);
    }
}