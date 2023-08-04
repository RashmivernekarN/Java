import java.io.*;
class gender
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
       
       { char scode;
        System.out.println("Enter the Figure Code:");
        scode=(char)System.in.read();
        Switch (scode)
        {
    case 'm':
        System.out.println("Male");
        break;
    case 'f':
        System.out.println("Female");
        break;
    Default:
        System.out.println("Invalid Gender");
        }
        
    }
}}