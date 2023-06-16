//PROGRAM TO ILLUSTRATE SWITCH 
 
class Test1 
{
   public static void main(String args[])
   {      
      char ch = 'O';
      switch(ch) 
        {
         case 'A' : 
         case 'E' :
         case 'I' :
         case 'O' :                
         case 'U' :
         case 'a' : 
         case 'e' :
         case 'i' :
         case 'o' :                
         case 'u' :
              System.out.println("ENTERED CHARACTER IS VOWEL");
               break;
         default :
                 System.out.println("NOT VOWEL");
       	          break;
      }
     System.out.println("ENTERED CHARACTER IS  " + ch);
   }
}