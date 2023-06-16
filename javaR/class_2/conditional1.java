class conditional1
{
     public static void main(String args[])
       {
           int p,q,r,big;
           p=20;
           q=50;
		   r=100;
           big=(p>q&&p>r)?p:((q>r)?q:r);
           System.out.println(big+" is big");
        }
}      