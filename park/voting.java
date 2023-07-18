// program to find area of circumference of circle.
import java.io.*;
class student
{
	public static void main(String args[])throws IOException
	{
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
	{
		int rollno,std,m1,m2,m3,total;
		double per;
		String name,g;
		System.out.println("Enter the Name:");
		name=stdin.readLine();
		System.out.println("Enter the Rollno:");
		rollno=Integer.parseInt(stdin.readLine());
		System.out.println("Enter the Class:");
		std=Integer.parseInt(stdin.readLine());
		System.out.println("Enter the Subject kannada:");
		m1=Integer.parseInt(stdin.readLine());
		System.out.println("Enter the Subject English:");
		m2=Integer.parseInt(stdin.readLine());
		System.out.println("Enter the Subject Hindi:");
		m3=Integer.parseInt(stdin.readLine());
		total=m1+m2+m3;
		per=total/3;
		System.out.println("Name of the Student:="+name);
	    System.out.println("Student Rollno:"+rollno);
	    System.out.println("Total Marks of Subject:"+total);
	    System.out.println("Total Percentage of Subject:"+per);
	    {
	    	if(per>=75)
	    		System.out.println("A");
	    	else if(per>=60 && per<75)
	    		System.out.println("B");
	    	else if(per>=50 && per<60)
	    		System.out.println("C");
	    	else 
	    		System.out.println("D");
	     System.out.println("Grade:"+g);
	    }
	}
}}