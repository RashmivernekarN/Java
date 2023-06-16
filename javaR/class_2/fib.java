//PROGRAM TO GENERATE FIBONACCI SERIES
class fib
{
   public static void main(String args[])
    {
		int f1=-1,f2=1,f3;
	System.out.println("\nfibonacci series up to 10 are");
       for(int i=1;i<=10;i++)
       {
		    f3=f1+f2;
            System.out.println(f3);
            f1=f2;
            f2=f3;   			
         }
       
    }  
}