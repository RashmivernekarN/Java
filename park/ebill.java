import java.io.*;
class ebill
{
    public static void main(String args[])throws IOException
    {
BufferedReader stdin= new BufferedReader(new InputStreamReader(System.in));
    {
        int rrno,prr,par,units;
        double amount,tax,ebill;
        String name;
        System.out.println("Enter the  Name:");
        name=stdin.readLine();
        System.out.println("Enter the rrno:");
        rrno=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Present Reading:");
        prr=Integer.parseInt(stdin.readLine());
        System.out.println("Enter the Past Reading:");
        par=Integer.parseInt(stdin.readLine());
        
        units=prr-par;
            {
            
            if(units<=50)
                amount=units*4.75;
            else
                amount=units*5;
            tax=amount*9/100;
            ebill=amount+tax;
        }
        
        System.out.println("Name and addree:="+name);
        System.out.println("RRNO:"+rrno);
        System.out.println("Present reading:"+prr);
        System.out.println("Past Reading:"+par);
        System.out.println("Consumed Unit :"+units);
        System.out.println("Amount:"+amount);
        System.out.println("Tax amount:"+tax);
        System.out.println("Electricity Bill:"+ebill);
        System.out.println("Bill date:10-07-23, Due Date:25-07-23");
    }
}}