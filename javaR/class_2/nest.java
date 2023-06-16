//program to illustrate nested if 

class nest
{
     public static void main(String args[])
       {
         int user=123;
		 int psw=321;
        if(user==123)
          {
		   if(psw==321)
             System.out.println("LOGIN SUCCESSFULL");
			 else
			 System.out.println("invalid password");
          }
           else
           System.out.println("invalid user");
     }
}