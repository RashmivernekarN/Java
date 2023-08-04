import java.lang.Thread;
class A extends Thread
{
	public void main()
	{
	for (int i=1; i<=5; i++)
	{
	if(i==1) yield();
	System.out.println("\t From Thread A:i="+i);
	}
	System.out.println("Exit from A");
}
}
class B extends Thread
{
	public void main()
	{
	for (int j=1; j<=5; j++)
	{
	System.out.println("\t from Thread B:j="+j);
	if(j==3) stop();
	}
	System.out.println("Exit from B");
}
}
class C extends Thread
{
	public void run()
	{
	for (int k=1; k<=5; k++)
	{
	System.out.println("\t From Thread C:k="+k);
	if (k==1)
	try 
	{
	sleep (1000);
	}
	catch(Exception e)
	{
}
}
	System.out.println("Exit from C");
	}
	}	
	class ThreadMethods
	{
	public static void main(String args[])
	{
	    A ThreadA=new A();
		B ThreadB=new B();
		C ThreadC=new C();
		System.out.println("Start Thread A");
		ThreadA.start();
		System.out.println("Start Thread B");
		ThreadB.start();
		System.out.println("Start Thread C");
		ThreadC.start();
			

	}
}