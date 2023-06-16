class student
{
	int rlno;
	double per;
	void getdata(int x,double y)
	{
		rlno=x;
		per=y;
	}
	void putdata()
	{
		System.out.println("Roll no="+rlno+"\nper="+per);
	}
}
class sample
{
  public static void main(String args[])
  {
      student s1=new student();
		s1.getdata(101,98.88);
		s1.putdata();
  }
}  