public class RingAnnouncer {
    public static void main(String[] args) {
        String[] record = {"WIN", "WIN", "WIN", "LOSS", "WIN", "WIN", "LOSS"};
        //int count=0;
        int wins =0;
        int loss = 0;
        for(int i=0; i< record.length; i++){
            if(record[i].equals("WIN")){
                wins +=1;
                //System.out.println("Wins is: "+wins);
            }else{
                loss += 1;
                //System.out.println("LOSS is "+loss);
            }
        }
        System.out.println(" \nWith a professional record of " +wins+" Wins and "+ loss+" losses. ");


    }
}
