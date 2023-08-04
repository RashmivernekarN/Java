import java.lang.*;
class Student
{
	int rollNumber;
	void getNumber(int n)
	{
	rollNumber=n;
	}
	void putNumber()
	{
	System.out.println("RollNo:"+rollNumber);
	}
}
class Test extends Student
{
	float part1,part2;
	void getMarks(float m1,float m2)
	{
	part1=m1;
	part2=m2;
	}
	void putMarks()
	{
	System.out.println("Marks obtained");
	System.out.println("part1="+part1);
	System.out.println("part2="+part2);
	}
}
interface Sports
{
	float SportWt=60F;
	void putWt();
	}
	class Results extends Test implements Sports
	{
	float total;
	public void putWt()
	{
	System.out.println("SportsWt="+SportWt);
	}
	void display()
	{
	total=part1+part2+SportWt;
	putNumber();
	putMarks();
	putWt();
	System.out.println("Total Score="+total);
	}
	}
	class Hybrid
	{
	public static void main(String args[])
	{
	Results Student1=new Results();
	Student1.getNumber(1234);
	Student1.getMarks(27.5F,33.0F);
	Student1.display();
	}}