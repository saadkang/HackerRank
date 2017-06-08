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

//        f(x, y, z) = x + 1/z - y;
//        Say x = 5;
//        f(5) = 5 + 1 = 6;

    public Car(int customMaxSpeed, double customWeight, boolean customIsTheCarOn){
        maxSpeed = customMaxSpeed;
        weight = customWeight;
        isTheCarOn = customIsTheCarOn;
    }

    public void printVariables() {
        System.out.println("This is the max speed: " + maxSpeed);
        System.out.println("This is the min speed: "+minSpeed);
        System.out.println("The weight of the Car is: "+weight);
        System.out.println("Is the Car on? "+isTheCarOn);
        System.out.println("The condition of the Car is: "+condition);
        System.out.println("The name of the Car is: "+nameOfCar);
        System.out.println("Number of people in the Car is: "+numberOfPeopleInCar);
    }

    public void wreckCar() {
        condition = 'C';
    }

    public void upgradeMinSpeed() {
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
    public double howManyMilesTillOutOfGas(){
        return currentFuel * mpg;
    }
    public double maxMilesPerFillUp(){
        return maxFuel * mpg;
    }
    public static void main(String[] args) {
//        System.out.println("Birthday Car:");
//        Car car2 = new Car(500, 5000.545, true);
//        car2.printVariables();
//        System.out.println("Christmas Car:");
//        Car car21 = new Car(550, 2000, false);
//        car21.printVariables();
        Car birthdayPresent = new Car(500, 5000.545, true);
        System.out.println("Birthday Car v1");
        birthdayPresent.printVariables();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        birthdayPresent.getIn();
        System.out.println("Miles left: "+birthdayPresent.howManyMilesTillOutOfGas());
        System.out.println("Max Miles: "+birthdayPresent.maxMilesPerFillUp());
        System.out.println("Birthday Car v2");
        birthdayPresent.printVariables();
        birthdayPresent.getOut();
        System.out.println("Birthday Car v3");
        birthdayPresent.printVariables();
    }
}