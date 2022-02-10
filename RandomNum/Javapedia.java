import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int input = scan.nextInt();
        String[][] variable = new String[input][3];
        scan.nextLine();
        for(int i =0; i< variable.length; i++)
        {
            System.out.println("\n\tFigure " + (i+1));
            System.out.print("\t - Name: ");
            variable[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            variable[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            variable[i][2] = scan.nextLine();
            System.out.print("\n");


        }
        System.out.println("These are the values you stored:");
        print2DArray(variable);

        System.out.print("\nWho do you want information on? ");
        String name = scan.nextLine();
        for(int i=0; i< variable.length; i++){
            if(variable[i][0].equals(name)){
                System.out.println("\t NAme : "+variable[i][0]);
                System.out.println("\t DOB : "+ variable[i][1]);
                System.out.println("\t Occupation : " + variable[i][2]);
            }
        }

        scan.close();
    }


    public static void print2DArray(String random[][]){
        for(int i =0; i<random.length; i++){
            for(int j = 0; j<random[i].length; j++){
                System.out.print(random[i][j]+ " ");
            }
            System.out.print("\n ");
        }
    }
}
