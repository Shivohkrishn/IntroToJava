import java.util.Scanner;

public class Boolean {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter name1");
        String input1 = scan.nextLine();
        System.out.println("enter name2");
        String input2 = scan.nextLine();
        if(input1.equals(input2)){
            System.out.println("equal");
        } else{
            System.out.println("not Equal");
        }
    }
}
