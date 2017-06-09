package car;

/**
 * Created by saadi on 6/8/2017.
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

//    f(x, y, z) = x + 1/z - y;
//    Say x = 5;
//    f(5) = 5 + 1 = 6;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn) {
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the max speed: " +maxSpeed);
        System.out.println("This is the min speed: " +minSpeed);
        System.out.println("The weight of the car.Car is: " +weight);
        System.out.println("Is the car.Car on? " +isTheCarOn);
        System.out.println("The condition of the car.Car is: " +condition);
        System.out.println("The name of the car.Car is: " +nameOfCar);
        System.out.println("Number of people in the car.Car is: " +numberOfPeopleInCar);
    }
    public void upgradeMinSpeed(){
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }

    public void getIn(){
//        numberOfPeopleInCar = numberOfPeopleInCar + 1;
        numberOfPeopleInCar++;
    }

    public void getOut(){
//        numberOfPeopleInCar = numberOfPeopleInCar - 1;
        numberOfPeopleInCar--;
    }

    public double howManyMilesTillOutOfGas() {
        return currentFuel * mpg;
    }

    public double maxMilesPerFillUp() {
        return maxFuel * mpg;
    }

    public static void main(String[] args) {
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday car.Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: " + birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: " + birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday car.Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday car.Car v3");
        birthdayPresent.printVariables();
    }
}