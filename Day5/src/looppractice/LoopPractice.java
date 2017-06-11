package looppractice;

/**
 * Created by saadi on 6/9/2017.
 */
public class LoopPractice {

    public static void practiceWhileLoop(){
        int x = 0;
        while (x < 5){
            System.out.println("The value of x is "+x);
//            x = x + 1;
            x++;
        }
    }
    public static void practiceDoWhileLoop(){
        int x = 0;
        do {
            System.out.println("The value of x is "+x);
            x++;
        }while (x < 10);
    }
    public static void practiceForLoopIncrementing(){
        for (int x = 0; x < 20; x++){
            System.out.println("The value of x is "+x);
            if (x == 10){
                break;
            }
        }
        System.out.println("This is the end");
    }
    public static void practiceForLoopDecrementing(){
        for (int x = 10; x > 0; x--){
            System.out.println("The value of x is "+x);
        }
    }
    public static void practiceNestedLoop(){
        for (int x = 0; x < 10; x++){
            for (int y = 0; y < 10; y++){
                System.out.println("("+x+", "+y+")");
            }
        }
    }
    public static void main(String[] args) {
        practiceWhileLoop();
        practiceDoWhileLoop();
        practiceForLoopIncrementing();
        practiceForLoopDecrementing();
        practiceNestedLoop();
    }
}
