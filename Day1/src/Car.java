/**
 * Created by saadi on 6/7/2017.
 */
public class Car {

    int maxSpeed = 100;
    int minSpeed = 0;
    double weight = 4079;
    boolean isTheCarOn = false;
    char condition = 'A';
    String nameOfCar = "Tania";
    double maxFuel = 16;
    double currentFuel = 8;
    double mpg = 26.4;
    int numberOfPeopleInCar = 1;

    public void printVariables(){
        System.out.println("This is the max speed: "+maxSpeed);
        System.out.println("This is the min speed: "+minSpeed);
        System.out.println("This is the weight of the day1: "+weight);
        System.out.println("Is the day1 on? "+isTheCarOn);
        System.out.println("What is the day1's condition? "+condition);
        System.out.println("The name of the day1 is: "+nameOfCar);
    }
    public void wreckCar(){
        condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
//        Car day1 = new Car();
//        day1.printVariables();
//        These above lines are commented out because first the lady on the video created the object using the 'day1' as object name
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
//        Car saadCar = familyCar;
//        familyCar.wreckCar();
//        I guess the above lines still have a purpose but I wanted to see the individual result and not mix them so I can understand it better
        familyCar.upgradeMinSpeed();
//        System.out.println("Saad's Car:");
//        saadCar.printVariables();
        familyCar.printVariables();
    }
}
