public class HighScore {
    public static void main(String[] args) {
        int[] scores = {randomNumber(), randomNumber(), randomNumber(), randomNumber(),
        randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        System.out.print("Here are the scores: ");
        for(int i=0; i< scores.length; i++){
           System.out.print(scores[i]+ " ");
        }
        int highScore =0;
        for(int i=0; i<scores.length; i++){
            if(scores[i]>highScore){
                highScore =scores[i];

                System.out.println("\\n\\nThe highest score is:" + highScore+ ". Give that man a cookie!");
                System.out.println("It's the gentleman in seat:" +i);

            }
        }
    }
    public static int randomNumber(){
        int random = (int)((Math.random()*50000)+1);
        return random;
    }
}
