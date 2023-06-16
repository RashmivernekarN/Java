import java.util.*;
class xyz
{
     public static void main(String args[ ])
       {
         int a,b,c;
      dataInputStream dis=new dataInputStream(System.in);
        a=dis.readLine();
        b=dis.readLine();
        c=dis.readLine();
        if(a>b&&a>c)
             System.out.println(a+"is BIG");
     else if( b>a&&b>c)
           System.out.println(b+"is big");
     else if( c>a&&c>b)
           System.out.println(c+"is big");
     }
}