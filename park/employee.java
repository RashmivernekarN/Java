// program to find area of circumference of circle.
import java.io.*;
class employee
{
	public static void main(String args[])throws IOException
	{
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
	{
		int code;
		double basic,hra,da,gross,pf,esi,tax,ded,net;
		String name,design;
		System.out.println("Enter the Name:");
		name=stdin.readLine();
		System.out.println("Enter the Design:");
		design=stdin.readLine();
		System.out.println("Enter the Employee Code:");
		code=Integer.parseInt(stdin.readLine());
		System.out.println("Enter the Basic Salary:");
		basic=Integer.parseInt(stdin.readLine());
		{
			hra=basic*32/100;
			da=basic*16/100;
			gross=basic+hra+da;
			pf=basic*12/100;
			esi=basic*1.75/100;
			tax=basic*18/100;
			ded=pf+esi+tax;
			net=gross-ded;
		}
		
		System.out.println("Name of the Employee:="+name);
	    System.out.println("Employee Designation:"+design);
	    System.out.println("Employee Code:"+code);
	    System.out.println("Basic Salary:"+basic);
	    System.out.println("House Rent Allownce:"+hra);
	    System.out.println("Dearness Allownce:"+da);
	    System.out.println("Gross Salary:"+gross);
	    System.out.println("Providend Fund Salary:"+pf);
	    System.out.println("Employee Service Health Insurance:"+esi);
	    System.out.println("Value Added Tax:"+tax);
	    System.out.println("Deducted Salary:"+ded);
	    System.out.println("Net Salary:"+net);
	    {
	    	System.out.print("Grade:=");
	    	if(net>=75000)
	    		System.out.print("Richest");
	    	else if(net>=50000 && net<75000)
	    		System.out.print("Rich");
	    	else if(net>=20000 && net<50000)
	    		System.out.print("Middle");
	    	else 
	    		System.out.print("Poor");
	     
	    }
	}
}}