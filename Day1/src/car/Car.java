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
        System.out.println("This is the weight of the Car: "+weight);
        System.out.println("Is the Car on? "+isTheCarOn);
        System.out.println("What is the Car's condition? "+condition);
        System.out.println("The name of the Car is: "+nameOfCar);
    }
    public void wreckCar(){
        condition = 'C';
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public static void main(String[] args) {
        Car familyCar = new Car();
        System.out.println("Family's Car:");
        familyCar.printVariables();
        Car aliceCar = familyCar;
        familyCar.wreckCar();
        familyCar.upgradeMinSpeed();
        System.out.println("Alice's Car:");
        aliceCar.printVariables();
        familyCar.printVariables();
    }
}
