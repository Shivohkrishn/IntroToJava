import java.util.Scanner;

public class GuessNum  {
    public static void main(String[] args) {
        int number = computerChoice();
        System.out.println("This is Computer Choice: "+number);


        System.out.print("I chose a number between 1 and 5. Try to guess it: ");
        Scanner scan = new Scanner(System.in);
        int guess = scan.nextInt();

        while (guess != number) {
            System.out.print("Guess again: ");
            guess = scan.nextInt();
            System.out.println("This is number from user: "+ guess);
        }

        System.out.println("You got it!");
        scan.close();

    }
    public static int computerChoice(){

        double random = Math.random()*6;
        random+=1;
        return (int)random;

    }


}