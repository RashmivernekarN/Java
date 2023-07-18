import  java.io.*;
class stu
{
	public static void main(String args[])throws IOException
	{
BufferedReader stu=new BufferedReader(new InputStreamReader(System.in));
int rollno,kan,eng,hin,tmar;
double per;
String name;
System.out.println("Enter the Rollno:");
rollno=Integer.parseInt(stu.readLine());
System.out.println("Enter the name:");
name=stu.readLine();
System.out.println("Enter the Marks of Kannada:");
kan=Integer.parseInt(stu.readLine());
System.out.println("Enter the English:");
eng=Integer.parseInt(stu.readLine());
System.out.println("Enter the Hindi:");
hin=Integer.parseInt(stu.readLine());
tmar=kan+eng+hin;
per=tmar/3;
System.out.println("Total Marks:="+tmar);
System.out.println("Percentage:="+per);
{
System.out.println("Grade:=");

	if(per>=75)
		System.out.print("A");
	else if(per>=60 && per<75)
		System.out.print("B");
	else if(per>=50 && per<60)
		System.out.print("C");
	else if(per>=35 && per<50)
		System.out.print("Pass");
	else
		System.out.print("Fail");
	
	}
}
}