 import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] value = {"ooha", "neha", "sneha"};
//        String[] value2 = new String[3];
//        for(int i=0; i<value2.length; i++){
//            value2[i] = value[i];
//        }
        String[] value2 = Arrays.copyOf(value, value.length);
        value2[1] = "shiv";

        System.out.println(Arrays.toString(value));
        System.out.println(Arrays.toString(value2));
        String[][] table = new String[3][3];
        System.out.println(Arrays.toString(table[0]));

    }
}
