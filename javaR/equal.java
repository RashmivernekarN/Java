//equals 
class equal
{
public static void main(String arg[])
 {
String s1,s2,s3,s4;
s1="Hello";
s2="Hello";
s3="good-bye";
s4="hello"; 
System.out.println(s1+"equals"+s2+"---->"+s1.equals(s2));
System.out.println(s1+"equals"+s3+"---->"+s1.equals(s3));
System.out.println(s1+"equals"+s2+"---->"+s1.equals(s4)); 
System.out.println(s1+"equals"+s4+"---->"+s1.equalsIgnoreCase(s4));
}

}