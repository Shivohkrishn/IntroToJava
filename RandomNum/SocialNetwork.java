import java.util.Scanner;
public class SocialNetwork {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        String userName = "ooha";
//        String passWord = "password";
        System.out.println("Enter the username");


        String userName = scan.nextLine();
        System.out.println("Enter the Password");
        String passWord = scan.nextLine();
        while(!(userName.equals("ooha")&& passWord.equals("pass"))){
            System.out.println("please try again");
            System.out.println("Enter the username");
             userName = scan.nextLine();
            System.out.println("Enter the Password");
             passWord = scan.nextLine();

        }
        System.out.println("log in");


    }
}
