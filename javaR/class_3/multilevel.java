import java.util.Scanner;
class A
{
	 Scanner s1=new Scanner(System.in);
	 int rlno;
	 String name;
	 void getdata()
	 {
		 System.out.println("Enter roll number of student");
		 rlno=s1.nextInt();
		 System.out.println("Enter Name of student");
		 name=s1.next();
	 }
     void putdata()
	 {
           System.out.println("Roll no="+rlno+"\n NAme="+name);		 
	 }
}
class B extends A
{
   	 Scanner s1=new Scanner(System.in);
	 int m1,m2,m3;
	 void accept()
	 {
		  getdata();
		   System.out.println("Enter marks of 3 sub");
		    m1=s1.nextInt();
		   m2=s1.nextInt();
		  m3=s1.nextInt();
	 }
      void display()
	  {
             putdata();
			  System.out.println("\nm1="+m1+"\nm2="+m2+"\nm3="+m3);
	  }
}	  
class C extends B
{
	  void print()
	  {
		     display();
			 int tot=m1+m2+m3;
			  System.out.println("Total="+tot);
	  }
}
class multilevel
{
	 public static void main(String args[])
    {
		C x=new C();
		x.accept();
		x.print();
	}
}

		 
	 
	 