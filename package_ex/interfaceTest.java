interface area
  {
    final Static double pi=3.142;
    double Compute (double x,double y);
   }
class Rectangle implement area
{
   public double compute(double x,double y)
{
return(x*y);
}
}
class circle imlement area {
public double compute (double x,double y)
{
return (pi*x*y);
}
}
class interfaceTest
{
publicstatic void main(string args[])
{
Rectangle rect1=new REctangle();
circle cir=new circle();
}
area a;
a=rect;
System.Out.println("ARea of rect="+a.compute(10,20));
a=cir;
System.Out.println("ARea of rect="+a.compute(10,20));
}
}
