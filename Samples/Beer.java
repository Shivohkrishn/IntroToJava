import java.util.Scanner;

public class Beer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        System.out.println("Write what u want to write");
//        int write = scan.nextInt();
//        System.out.println("Calls "+write);
        for(int i=9; i>= 1; i--){
            prints(i);
        }
    }
    public static void prints(int i){
        System.out.println(i+" bottles of beer on the wall," +i+ " bottles of beer!\n" +
                " *    take one down, pass it around "+(i-1)+ " , bottles of beer on the wall!");
    }
}
