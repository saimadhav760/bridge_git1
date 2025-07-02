import java.util.Scanner;
public class userinput
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter No.1 ");
       /* int a = sc.nextInt();
        System.out.println("Enter No.2 ");
        int b = sc.nextInt();
        int sum = a+b;
        System.out.print("The Sum is ");
        System.out.println(sum);*/
        boolean b1 =sc.hasNextInt();
        System.out.println(b1);
    }
}
