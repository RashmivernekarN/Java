import java.io.*;
class matrixarray
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int a[][]=new int[10][10];
        int b[][]=new int[10][10];
        int c[][]=new int[10][10];
       
        int n,m,i,j=0;
        System.out.println("Enter the value of m:");
        m=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the value of n:");
        n=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Elements of first Array:");
        for(i=0;i<m;i++) 
        for(j=0;j<n;j++)      
        a[i][j]=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the elements of second array:");
        for(i=0;i<m;i++)
        for(j=0;j<n;j++)
        b[i][j]=Integer.parseInt(stdin.readLine());
        System.out.println("Elemens of first array are:");
        for(i=0;i<m;i++)
        {
          for(j=0;j<n;j++)
          {
            System.out.println(a[i][j]+"");
        }
            System.out.println();
          }
          System.out.println("Enter the Elements of Second Array:");
        for(i=0;i<m;i++) 
        {
        for(j=0;j<n;j++)
        {
        System.out.println(b[i][j]+"");
        }
        System.out.println();
        }
        c[i][j]=0;
         for(i=0;i<m;i++)
        for(j=0;j<n;j++)
            c[i][j]=a[i][j]+b[i][j];
        System.out.println("Result matrix:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(c[i][j]+""); 
            }
            System.out.println();
        }
}
}}