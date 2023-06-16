//append 
class append
{
public static void main(String arg[])
 {
String s=new String();
int a=42;
StringBuffer sb=new StringBuffer(40);
s=sb.append("a=").append(a).append("!").toString();
System.out.println(s); 
}

}