import java.util.Scanner;

public class Prints {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Write what u want to write");
        int write = scan.nextInt();

        for(int i=1; i<= write; i++){
        System.out.println(i+ "." + write );
    }
}}
