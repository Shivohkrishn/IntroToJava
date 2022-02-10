import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the radius: ");
        int radius = scan.nextInt();
        System.out.println("The area is "+ String.format("%.2f",Math.PI*Math.pow(radius,2))+
                "\nDiameter is "+(2*radius)+
                "\nCircumference is "+ String.format("%.2f",2*Math.PI*radius));

    }

}
