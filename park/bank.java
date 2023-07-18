import java.io.*;
class bank
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int accno;
        double bal,inte,net;
        String name,branch,ifsc;
        System.out.println("Enter the holder Name:");
        name=stdin.readLine();
        System.out.println("Enter the account number:");
        accno=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the branch:");
        branch=stdin.readLine();
        System.out.println("Enter the code of ifsc:");
        ifsc=stdin.readLine();
        System.out.println("Enter the Balance amount:");
        bal=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the inte:");
        inte=Integer.parseInt(stdin.readLine());
        {
            inte=bal*7.5/100;
            net=bal+inte;
        }
        
        System.out.println("Name of the holder:="+name);
        System.out.println("branch of the bank:"+branch);
        System.out.println("accno the your bank account number:"+accno);
        System.out.println("ifsc code of bank:"+ifsc);
        System.out.println("inte :"+inte);
        System.out.println("bal your bankaccount Balance:"+bal);
        System.out.println("totle amount:"+net);
    }
}}