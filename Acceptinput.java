import java.util.Scanner;

class Acceptinput{

public static void main (String[] args){
    int a;
    Scanner s = new Scanner (System.in);
    System.out.println("Enter your lucky number");
    a = s.nextInt();
    System.out.println("Your lucky number is: " +a);
}
}