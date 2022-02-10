import java.util.Arrays;
import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Here are the Apples jim brought");

        String[] apples = {"Gala", "Granny Smith", "Macintosh"};
        double[] price = {1.99, 1.49, 1.29};
//
//        for(int i=0; i<3;i++){
//            String apple = scan.nextLine();
//        }
//        System.out.println("These are the price of apples");
//        for(int j=0; j<3;j++){
//            int price = scan.nextInt();
//        }
        System.out.println("Here's your receipt:\n");
        for(int k=0; k<3; k++){
            System.out.println("\\t" +apples[k]+ " "+ k + ": $" +price[k]+ " "+k );
        }
        /* Task 2
            Use a for loop to print each apple and the corresponding price.
            
            for {
                println(\t<apple i >: $<price i >)
            }
        */
    }
}