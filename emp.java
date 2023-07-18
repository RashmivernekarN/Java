import  java.io.*;
class emp
{
	public static void main(String args[])throws IOException
	{
BufferedReader stdin=new BufferedReader(new InputStreamReader(System.in));
int empcode;
double basic,hra,da,gross,pf,tax,esi,ded,net;
String ename,design;
System.out.println("Enter the Employee Code:");
empcode=Integer.parseInt(stdin.readLine());
System.out.println("Enter the Employee Name:");
ename=stdin.readLine();
System.out.println("Enter the Employee Design:");
design=stdin.readLine();
System.out.println("Enter the Basic Salary:");
basic=Double.parseDouble(stdin.readLine());

{
	hra=basic*32/100;
	da=basic*16/100;
	gross=basic+hra+da;
	pf=basic*12/100;
	tax=basic*18/100;
	esi=basic*1.75/100;
    ded=pf+tax+esi;
    net=gross-ded;
}
System.out.println("               Employee Code:="+empcode);
System.out.println("               Employee Name:="+ename);
System.out.println("        Employee Designation:="+design);
System.out.println("       Employee Basic Salary:="+basic);
System.out.println("Employee House Rent Allownce:="+hra);
System.out.println("  Employee Dearness Allownce:="+da);
System.out.println("       Employee Gross Salary:="+gross);
System.out.println("     Employee Providend Fund:="+pf);
System.out.println("                Employee ESI:="+esi);
System.out.println("                Employee Tax:="+tax);
System.out.println("          Employee Deduction:="+ded);
System.out.println("         Employee Net Salary:="+net);
{
// System.out.println("                      Grade:=");

	if(net>=75000)
		System.out.print("                   Grade:A");
	else if(net>=60000 && net<75000)
		System.out.print("Grade:B");
	else if(net>=50000 && net<60000)
		System.out.print("Grade:C");
	else if(net>=30000 && net<50000)
		System.out.print("Grade:D");
	else
		System.out.print("                  Grade:E");
	
	}
}
}