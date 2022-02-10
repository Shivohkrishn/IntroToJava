import java.util.Arrays;

public class Prices {
    public static void main(String[] args) {
       // double[][] groc = new double[3][5];
        double[][] groc = {
                {1,2,3,4,5},
                {1,3.3,4,5,6},
                {3,4.5,2,4,5}
        };
        //System.out.println(groc.length);
        for(int i=0; i<groc.length; i++){
            switch(i){
                case 0:
                    System.out.print("BAking: ");
                    break;
                case 1:
                    System.out.print("Bevrages : ");
                    break;
                case 2:
                    System.out.print("Cereals : ");
                    break;
            }
           for(int j =0; j<groc[i].length; j++){
               System.out.print(groc[i][j]);
           }
            System.out.print("\n");
        }

    }
}
