import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        //set up scanner.
        Scanner input = new Scanner(System.in);

        System.out.println("Hello. What is your name?");
        //Pick up user's name and store it.
        String name = input.nextLine();

        //add new a line before asking next question.
        System.out.println("\n Hi " +name+"!, I'm Javabot. Where are you from? ");
        //Pick up user's home and store it.
        String home = input.nextLine();


        //add new a line before asking next question.
        System.out.println("\n I hear it's beautiful at" +home+"! I'm from a place called Oracle");
        System.out.println("\n How old are you? ");
        //Pick up age and store it.
        int age = input.nextInt();


        //add new a line before asking next question.
        System.out.println("\n So you're" +age+", cool! I'm 400 years old.");
        System.out.println(" This means I'm "+(400/age)+ " times older than you.");
        System.out.println(" Enough about me. What's your favourite language? (just don't say Python)");
        input.nextLine();
        //Pick up language and store it.
        String language = input.nextLine();

        //add new a line here.
        System.out.println("\n " +language+" , that's great! Nice chatting with you" +name+ ". I have to log off now. See ya!");

        //close scanner.
        input.close();

    }
}
