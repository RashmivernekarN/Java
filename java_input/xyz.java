import java.io.*;
class xyz
{
     public static void main(String args[ ])throws IOException
       {
		   String s1,s2,s3;
         int a,b,c;
     DataInputStream dis = new DataInputStream(System.in);
	 System.out.println("enter value for a");
        s1=dis.readLine();
		a=Integer.parseInt(s1);
		System.out.println("enter value for b");
        s2=dis.readLine();
		b=Integer.parseInt(s2);
		System.out.println("enter value for c");
        s3=dis.readLine();
		c=Integer.parseInt(s3);
        if(a>b&&a>c)
             System.out.println(a+"is BIG");
     else if(b>a&&b>c)
           System.out.println(b+"is big");
     else if(c>a&&c>b)
           System.out.println(c+"is big");
	     dis.close();
     }
}              