import java.util.Scanner;

public class PizzaDelivery {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pizza toppings do you want?");
        int input = scan.nextInt();
        String[] toppings = new String[input];
        System.out.println("Great, enter each topping!\n");
        scan.nextLine();
        for(int i=0; i< toppings.length; i++){
            System.out.print(i+".");
            toppings[i] = scan.nextLine();
        }
        System.out.println("\nThank you! Here are the toppings your ordered");
        for(int i=0; i< toppings.length; i++){
            System.out.println(i+ ". " +toppings[i]);
        }
        System.out.println("Press anything to confirm your order.");
        scan.nextLine();
        System.out.println("Great, a driver is on the way!");
    }
}
