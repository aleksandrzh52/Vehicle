public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    void range(){
        System.out.println("на растояние " + fuelcap * mpg + " км");
    }
}