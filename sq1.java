import  java.io.*;
class sq1
{
	public static void main(String args[])throws IOException
	{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int a,area,peri;
System.out.println("Enter the value of a:");
a=Integer.parseInt(br.readLine());
area=a*a;
peri=4*a;
System.out.println("Area:="+area);
System.out.println("Perimeter:="+peri);
	}
}