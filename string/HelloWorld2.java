public class HelloWorld2 {
   public static void main(String args[]) {
      String s1 = "t u t o r i a l s"; 
      String[] words = s1.split("\\s"); 
      for(String w:words) {
         System.out.println(w);  
      }  
   }
}