//PROGRAM TO ILLUSTRATE FOR LOOP
class loopcheck2
{
   public static void main(String args[])
    {
       int p=1;
       for(int i=1;i<=10;i++)
       {
            System.out.println(i);
            p=p*i;      
         }
       System.out.println("product="+p);
    }  
}