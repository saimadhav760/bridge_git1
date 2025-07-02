import java.util.Scanner;
public class marks
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in math");
        int a = sc.nextInt();
        System.out.println("Enter marks in english");
        int b = sc.nextInt();
        System.out.println("Enter marks in physics");
        int c = sc.nextInt();
        System.out.println("Enter marks in chemistry");
        int d = sc.nextInt();
        System.out.println("Enter marks in punjabi");
        int e = sc.nextInt();
        int TotalMarksObtained=a+b+c+d+e;
        int maxTotalMarks=500;
        double Percentage =((double)TotalMarksObtained/maxTotalMarks)*100;
        System.out.println("Percentage: " + Percentage +"%");
    }

}
