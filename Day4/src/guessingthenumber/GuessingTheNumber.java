package guessingthenumber;

/**
 * Created by saadi on 6/9/2017.
 */
public class GuessingTheNumber {

    public static void howBigIsMyNumber(int x){
        if (x >= 0 && x <= 10){
            System.out.println("Our number is pretty small");
        }else if(x >= 11 && x <= 100){
            System.out.println("Our number is pretty big");
        }else {
            System.out.println("Our number is out of range");
        }
    }
    public static void main(String[] args) {
        howBigIsMyNumber(0);
        howBigIsMyNumber(10);
        howBigIsMyNumber(11);
        howBigIsMyNumber(100);
        howBigIsMyNumber(5);
        howBigIsMyNumber(75);
        howBigIsMyNumber(-1);
        howBigIsMyNumber(105);
    }
}
