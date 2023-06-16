//program to illustrate if else(biggest of 3 numbers)

class big1
{
     public static void main(String args[])
       {
         int a,b,c;
        a=16;
        b=90;
        c=19;
        if(a>b&&a>c)
             System.out.println(a+"is BIG");
     else if( b>a&&b>c)
           System.out.println(b+"is big");
     else if( c>a&&c>b)
           System.out.println(c+"is big");
	   else
System.out.println(" not possible to say which is big");
     }
}