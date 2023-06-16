//PROGRAM TO ILLUSTRATE DO WHILE LOOP
 class loopcheck1
{
   public static void main(String args[])
    {
       int i=1,n=10,s=0;
       do
       {
            System.out.println(i);
            s=s+i;
            i++;
         }while(i<=n);
       System.out.println("sum="+s);
    }  
}