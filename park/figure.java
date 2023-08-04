import java.io.*;
class figure
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int fcode;
        Double b,h,r1,area,l,w,a;
        System.out.println("Enter the Figure Code:");
        fcode=Integer.parseInt(stdin.readLine());
        Switch (fcode)
        {
    case1:
        System.out.println("Enter the Figure Code:");
        l=Double.parseDouble(stdin.readLine());
        System.out.println("Enter the Figure Code:");
        w=Double.parseDouble(stdin.readLine());
        area=l*w;
        System.out.println("Area:="+area);
        break;
    case2:
        System.out.println("Enter the Base:");
        b=Double.parseDouble(stdin.readLine());
        System.out.println("Enter the Height:");
        h=Double.parseDouble(stdin.readLine());
        area=0.5*b*h;
        System.out.println("Area:="+area);
        break;
    case3:
        System.out.println("Enter the Radius:");
        r1=Double.parseDouble(stdin.readLine());
        area=3.142*r1*r1;
        System.out.println("Area:="+area);
        break;
    case4:
        System.out.println("Enter the side:");
        a=Double.parseDouble(stdin.readLine());
        area=a*a;
        System.out.println("Area:="+area);
        break;
    Default:
        System.out.println("Invalid Figure Code");
        }
        
    }
}}