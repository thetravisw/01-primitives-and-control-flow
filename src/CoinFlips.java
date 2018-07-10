import java.util.Random;

public class CoinFlips{

    public static void main(String args[])
    {
        //  Calling just to confirm it works.
        flipNHeads(3);
    }

    public static void flipNHeads (int n) {
        int totalFlips = 0;
        int consecutiveFlips = 0;
        while (consecutiveFlips < n) {
            totalFlips++;
            Random rand = new Random();
            double flip = rand.nextDouble();

            if (flip > 0.5){
                consecutiveFlips++;
                System.out.println("heads");
            }
            else {
                consecutiveFlips = 0;
                System.out.println("tails");
            }
        }
        System.out.println("It took " + totalFlips + " flips to flip " + n + " heads in a row");
    }
}