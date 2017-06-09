package guessthenumber;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by saadi on 6/9/2017.
 */
public class GuessTheNumber {

    int theNumber;
    int max;
    Scanner scanner = new Scanner(System.in);

    public GuessTheNumber(){
        Random rand = new Random();
        max = 100;
        theNumber = Math.abs(rand.nextInt() % (max + 1));
    }
    public void play() {
        while (true) {
            int move = scanner.nextInt();
            if (move > theNumber) {
                System.out.println("Your number is too big");
            } else if (move < theNumber) {
                System.out.println("Your number is too small");
            } else {
                System.out.println("You got it");
                break;
            }
        }
    }
    public static void main(String[] args) {
        GuessTheNumber guessGame = new GuessTheNumber();
        System.out.println("Welcome to my game. Try and guess my impossible"
                +"number. It's between 0 and "+guessGame.max+" inclusive. "
                +"Just type a number to get started");
        guessGame.play();
    }
}
