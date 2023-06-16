//getChars(int start,int end,char target[],int //targetstart

class getchars
{
public static void main(String arg[])
 {
String s;
s="this is a demo ofget chars method";
int start=17;
int end=19;
char buf[]=new char[end-start];
s.getChars(start,end,buf,0);
 System.out.println(buf);
}
}