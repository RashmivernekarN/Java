// program to display 10 natural number using while, do while, for.

import java.io.*;
class evenfor
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       int i=1,n,esum=0,osum=0;
System.out.println("Enter the value of n");
n=Integer.parseInt(stdin.readLine());
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            {
            System.out.println(i);
            esum=esum+i;
            System.out.println("Sum of even Numbers:="+esum);
            else
            osum=osum+i;
            
        System.out.println("Sum of Odd Numbers:="+osum);
}}}