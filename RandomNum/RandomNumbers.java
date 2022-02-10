public class RandomNumbers {
    public static void main(String[] args) {
        int[][] value = new int[10][10];
        for(int i= 0; i< value.length; i++){
            for(int j=0; j<value[i].length; j++){
                value[i][j]=genRandom();
            }
        }
        print2DArray(value);
    }
    public static int genRandom(){
        int random = (int)((Math.random()*100)+1);
        return random;
    }
    public static void print2DArray(int random[][]){
        for(int i =0; i<random.length; i++){
            for(int j = 0; j<random[i].length; j++){
                System.out.print(random[i][j]+ " ");
            }
            System.out.print("\n ");
        }
    }
}
