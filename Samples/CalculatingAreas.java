import java.util.Scanner;
public class CalculatingAreas {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("enter length");
        int length = input.nextInt();
        System.out.println("enter breadth");
        int breadth = input.nextInt();
        condition(length,breadth);


    }
    public static void condition(int length, int breadth){
        if(length<0 || breadth<0){
            System.out.println("Length or breadth can not be negative");
            System.exit(0);
        }else{
            double a1 = areaRect(length,breadth);
            printer(length,breadth,a1);

    }}

    public static double areaRect(double length, double breadth){
        double area = length * breadth ;
        return area;

    }
    public static void printer(double length, double breadth, double a1){
        System.out.println("area of rect of length "+length+" and breadth "+breadth+ " is "+a1);
    }
}
