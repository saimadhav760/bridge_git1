import java.util.Scanner;
public class HelloUser
{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String n = sc.next();
        System.out.println("Hello "+n+" have a good day");
    }
}
