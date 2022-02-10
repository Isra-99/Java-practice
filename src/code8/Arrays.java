package code8;

import java.util.Random;

public class Arrays {
    private static final int LENGTH  = 6;
    public static void main(String arg[]){
       /* int tickets[] = new int[10];
        int packs[]  = {1,3,4,5,6,7,8};
        System.out.println("the first letter of tickets is "+ tickets[0]);
        System.out.println("the first letter of packets is "+ packs[0]);*/
        int ticket[] = generateNum();
        display(ticket);

    }
    public static int[] generateNum(){
        int tickets[] = new int[LENGTH];
        /// now to generate random number we will use random method
        Random random = new Random();
        for ( int i= 0; i<LENGTH; i++){
            tickets[i] = random.nextInt(69)+1;// adding one to make sure ticket generted is between 1 and 69
        }
        return tickets;

    }
    public static  void display(int tickets[]){
        for (int i =0; i<LENGTH; i++)
        {
            System.out.print(" so here is the lottery ticket"+ tickets[i]);
        }
    }

}
