import java.util.Scanner;

public class TakingUserInput {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
        System.out.println("wht's ur name");
        String name = input.nextLine();
        System.out.println("my name is :"+name);

        System.out.println("\n what is ur age");
        int age = input.nextInt();
        System.out.println("\t my age is :" +age);

    }
}
