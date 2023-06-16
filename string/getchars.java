//getChars(int start,int end,char target[],int targetstart

class getchars
{
public static void main(String arg[])
 {
String s;
s="this is ademo of get chars method";
int start=5;
int end=9;
char buf[]=new char[end-start];
s.getChars(start,end,buf,0);
 System.out.println(buf);
}
}