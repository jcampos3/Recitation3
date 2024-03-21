import java.util.Scanner;

public class Recitation3 {
    public static void main(String[] argv)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter x:");
        double userx = scan.nextDouble();
        System.out.println("Enter y:");
        double usery = scan.nextDouble();
        //Circle example = new Circle(5);
        Circle circle16 = new Circle(new Point(userx,usery), 16);
        Circle circle40 = new Circle(new Point(14,12), 40);
        if(circle16.intersects(circle40)) {
            System.out.println("Circles intersect!");
        }else{
            System.out.println("Circles do not intersect!");

        }


        // add your code here
    }
}