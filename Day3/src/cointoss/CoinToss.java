package cointoss;

import java.util.Random;

/**
 * Created by saadi on 6/9/2017.
 */
public class CoinToss {

    public String tossACoin(){
        Random rand = new Random();
        int toss = Math.abs(rand.nextInt() % 2);
        if (toss == 0){
            return "HEADS";
        }else {
            return "TAILS";
        }
    }
    public static void main(String[] args) {
        CoinToss game = new CoinToss();
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
        System.out.println(game.tossACoin());
    }
}
