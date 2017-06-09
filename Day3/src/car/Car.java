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
    int maxNumberOfPeopleInCar = 6;

//        f(x, y, z) = x + 1/z - y;
//        Say x = 5;
//        f(5) = 5 + 1 = 6;

    public Car(){

    }
    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the max speed: " + maxSpeed);
        System.out.println("Min Speed: "+minSpeed);
        System.out.println("Weight: "+weight);
        System.out.println("Is the Car on? "+isTheCarOn);
        System.out.println("Condition: "+condition);
        System.out.println("Car name: "+nameOfCar);
        System.out.println("People in Car: "+numberOfPeopleInCar);
    }
    public void upgradeMinSpeed() {
        minSpeed = maxSpeed;
        maxSpeed = maxSpeed + 1;
    }
    public void getIn(){
//        numberOfPeopleInCar = numberOfPeopleInCar + 1;
//        If there aren't too many people in the Car
        if (numberOfPeopleInCar < maxNumberOfPeopleInCar){
//            then someone can get in
            numberOfPeopleInCar++;
            System.out.println("Someone got in");
        }else {
//            otherwise print out the fact that the Car is full
            System.out.println("The Car is full "+numberOfPeopleInCar+ " = " +maxNumberOfPeopleInCar);
        }
    }
    public void getOut(){
//        numberOfPeopleInCar = numberOfPeopleInCar - 1;
//        if there's people in the Car
        if (numberOfPeopleInCar > 0){
//            then tell one person to get out
            numberOfPeopleInCar--;
        }else {
//            otherwise no one can get out and we'll print that.
            System.out.println("No one is in the Car "+numberOfPeopleInCar);
        }
    }
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    public void turnTheCarOn(){
//        The statement inside the if brackets is saying 'isTheCar not on' which is the same thing as 'isTheCarOn == false'
//        If the Car isn't on...
        if (!isTheCarOn){
//            turn it on
            isTheCarOn = true;
        }else {
//            otherwise print the fact it's on'
            System.out.println("The Car is already on "+isTheCarOn);
        }
    }
    public static void main(String[] args) {
        Car tommyCar = new Car();
        tommyCar.getOut();
        tommyCar.getOut();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.getIn();
        tommyCar.turnTheCarOn();
        tommyCar.turnTheCarOn();

//        System.out.println("Christmas Car:");
//        Car christmasPresent = new Car(550, 2000, false);
//        christmasPresent.printVariables();
    }
}