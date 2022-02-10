import java.util.Scanner;

public class JavaGrocer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String aisles[] = {"apples", "bananas", "candy", "chocolate", "coffee", "tea"};
        System.out.println("What do you need");
        String response = scan.nextLine();
        for(int i=0; i<aisles.length; i++){
            if(aisles[i].equalsIgnoreCase(response)){
                System.out.println(" We have that in aisle: " +i);
                break;
            }

        }
    }
}
