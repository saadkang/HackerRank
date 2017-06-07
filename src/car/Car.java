package car;

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

    public void printVariables(){
        System.out.println("This is the max speed: "+maxSpeed);
        System.out.println("This is the min speed: "+minSpeed);
        System.out.println("This is the weight of the car: "+weight);
        System.out.println("Is the car on? "+isTheCarOn);
        System.out.println("What is the car's condition? "+condition);
        System.out.println("The name of the car is: "+nameOfCar);
    }
    public void wreckCar(){
        condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
//        Car car = new Car();
//        car.printVariables();
//        These above lines are commented out because first the lady on the video created the object using the 'car' as object name
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
