// program to find area of circumference of circle.
import java.io.*;
class circle
{
	public static void main(String args[])throws IOException
	{
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
	{
		double r,area=0, cir=0;
		System.out.println("Enter the value of radius:");
		r=Double.parseDouble(stdin.readLine());
		area=3.142*r*r;
		cir=2*3.142*r;
		System.out.println("Area:="+area);
		System.out.println("circumference:="+cir);
	}
}}