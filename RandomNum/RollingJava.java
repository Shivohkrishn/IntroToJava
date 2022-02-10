import java.util.Scanner;

public class RollingJava {
    public static void main(String[] args) {
        System.out.println("Let's play Rolling Java. Type anything to start.\n");
        System.out.println("Great, here are the rules:");
        System.out.println("- If you roll a 6 the game stops.");
        System.out.println("- If you roll a 4 nothing happens");
        System.out.println("- Otherwise, you get 1 point. \n");
        Scanner scan = new Scanner(System.in);
        System.out.println("You must collect at least 3 points to win. Enter anything to roll:");
        String input = scan.nextLine();
        int points = 0;
        while(true){
            int rollDice = RollDice();
            System.out.println("You rolled a: "+rollDice);
            if(rollDice == 6){
                System.out.println("End of game");
                break;
            }
            else if(rollDice == 4){
                System.out.println("Zero points. Keep rolling");
                continue;
            }
            else{
                points +=1;
                System.out.println("One point. Keep rolling.");
                continue;

            }
        }
        System.out.println("Your Score is : "+points);
        if(points >= 3){
            System.out.println("Wow, that's lucky. You win!");
        }else{
            System.out.println("you lose");
        }

    }
    public static int RollDice(){
        int random = (int)((Math.random()*6)+1);
        return random;
    }

}
