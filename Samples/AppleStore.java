public class AppleStore {
    public static void main(String[] args) {
        int numOfApples = 0;
        int numOfCustomers = 0;
        double profit = 0;
        int price = 0;


        System.out.println("You picked 500 apples from an apple orchard");
        //Update number of apples.
        numOfApples += 500;

        System.out.println("Time for business! You're selling each apple for 40 cents");
        //Make a price variable. Set it equal to 40 cents.
        price = 40;

        System.out.println("One customer walked in. He bought 4 apples!");
        //Update number of apples.
        numOfApples -= 4;
        //Update number of customers;
        numOfCustomers += 1;
        //Update profit

        System.out.println("Another customer walked in. He bought 20 apples!");
        //Update number of apples;
        //Update number of customers;
        //Update profit
        numOfApples -= 20;
        numOfCustomers += 1;


        System.out.println("Another customer walked in. She bought 200 apples!");
        //Update number of apples;
        //Update number of customers;
        //Update profit
        numOfApples -= 200;
        numOfCustomers += 1;
        numOfApples=500-numOfApples;
        profit = numOfApples*price;


        System.out.println("Wow! So far, you made: " +profit);
        System.out.println(numOfCustomers + " customers love your apples.");
        System.out.println("You have " +numOfApples+ " apples left. We'll sell more tomorrow!");




    }

}