import java.io.*;
class evenodd
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       int i,n,esum=0,osum=0;
System.out.println("Enter the value of n");
n=Integer.parseInt(stdin.readLine());

    for(i=1;i<=n;i++)
        {
            System.out.println(i);
            if(i%2==0)
            esum=esum+i;
            else
            osum=osum+i;
}
System.out.println("Sum of even Numbers:="+esum);
System.out.println("Sum of odd Numbers:="+osum);
    }
}