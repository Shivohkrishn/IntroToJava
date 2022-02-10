public class RollDouble {
    public static void main(String[] args) {
      //  int dice = 0;
        int dice1 = rollDice();
        int dice2 = rollDice();
        System.out.println("Dice 1: " + dice1);
        System.out.println("Dice 2: " + dice2 + "\n");
        while(dice1 != dice2){
             dice1 = rollDice();
             dice2 = rollDice();
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2 + "\n");

        }
        System.out.println("You rolled doubles!");
    }
    public static int rollDice(){
        double random = Math.random()*7;
        random += 1;
        return (int)random;

    }
}
