import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        System.out.println("Let's play Rock Paper Scissors");
        System.out.println("When I say 'shoot', Choose: rock, paper, or scissors.");
        Scanner input = new Scanner(System.in);
        System.out.println("Are you ready? Write 'yes' if you are");
        String option = input.nextLine();

        if(option.equals("yes")){
            System.out.println("Great");
            System.out.println("rock -- paper -- scissors, shoot!");
            Scanner scan = new Scanner(System.in);
            String UserChoice = scan.nextLine();
            System.out.println("User's Choice is: " +UserChoice);
            String ComputerChoice = computerChoice();
            System.out.println("Computer Choice is :" +ComputerChoice);
            if(UserChoice.equals(ComputerChoice)){
                System.out.println("Draw between Them");
            }
            else if((UserChoice.equalsIgnoreCase("Rock") && ComputerChoice.equalsIgnoreCase("SCISSORS"))||
                    (UserChoice.equalsIgnoreCase("PAPER") && ComputerChoice.equalsIgnoreCase("ROCK"))||
                    (UserChoice.equalsIgnoreCase("SCISSORS") && ComputerChoice.equalsIgnoreCase("PAPER"))){
                System.out.println(" YOU WON");
            }
            else{
                System.out.println("Computer Won");
            }
        }


    }
    public static String computerChoice(){
        double number = Math.round(Math.random()*2);
        int convNumber = (int) number;
        convNumber += 1;
       // System.out.print("Converted number is :"+convNumber);
        switch(convNumber){
            case 1:
                return "rock";
            case 2:
                return "paper";
            case 3:
                return "Scissors";
            default:
                return "invalid";

        }

    }
}
