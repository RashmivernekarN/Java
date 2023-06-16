//delete
class delete
{
public static void main(String arg[])
 {
StringBuffer sb=new StringBuffer("wel come to");
sb.delete(0,3);
System.out.println("after delete -->"+sb); 
sb.deleteCharAt(6);
System.out.println("after delete"+sb); 

}

}