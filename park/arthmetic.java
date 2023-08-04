import java.io.*;
class arthmetic
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    
       int code,a,b,sum,diff,prod,quo;
        System.out.println("Enter the value of a:");
        a=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the value of b:");
        b=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Figure Code:");
        code=Integer.parseInt(stdin.readLine());
        
    switch(code)
        {
    case 1:
    sum=a+b;
        System.out.println("Sum:="+sum);
        break;
    case 2:
    diff=a-b;
        System.out.println("Diff:="+diff);
        break;
    case 3:
    diff=a*b;
        System.out.println("Diff:="+diff);
        break;
    case 4:
    diff=a/b;
        System.out.println("Diff:="+diff);
        break;
       Default:
        System.out.println("Invalid Code");
        }
        
    }
} 