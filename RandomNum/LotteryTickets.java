import java.util.Arrays;

public class LotteryTickets{
    public static void main(String[] args) {
        int[] ticket = {34, 43, 45, 65, 21, 54};
        int[] ticket2 = Arrays.copyOf(ticket, ticket.length);
        System.out.println("Ticket 1 are : ");
        printNumbers(ticket);
        System.out.println("Ticket 2 are : ");
        printNumbers(ticket2);

    }
    public static void printNumbers(int[] ticket){

        for (int i = 0; i < ticket.length; i++) {
            System.out.print(ticket[i] + " ");
        }
        System.out.println("\n");
    }

}
