public class AreaCal {
    public static void main(String[] args) {
        Double Square = areaSquare(2);
        Double Rec =  areaRec(1,2);
        Double Tri =areaTri(2,1);
        Double Circle =areaCircle(2);
        prints(Square, Rec, Tri, Circle);

    }
    public static double areaSquare(double side){
        if(side<0){
            System.out.println("side cant be negative");
            System.exit(0);
        }
        double area = Math.pow(side,2);
        return area;


    }
    public static double areaRec(double length, double width){
        if(length<0|| width <0){
            System.out.println(" cant be negative");
            System.exit(0);
        }
            double area = length*width;
            return area;
    }
    public static double areaTri(double base, double height){
        if(base<0 || height <0) {
            System.out.println(" cant be negative");
            System.exit(0);
        }
            double area = (base*height)/2;
            return area;
    }
    public static double areaCircle(double radius){
        if(radius<0){
            System.out.println(" cant be negative");
            System.exit(0);
        }
            double area = Math.PI*Math.pow(radius,2);
            return area;
    }

    public static void prints(double Square, double Rec, double Tri, double Circle){
        System.out.println("\nThe area of Square: " +Square+ "\nThe area of Rec: "+ Rec+ "\nThe area of triangle: "
        +Tri+ "\nThe area of circle: "+Circle);
    }
}
