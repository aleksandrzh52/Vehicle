public class Vehicle {
    int passengers;  // кол-во пасажиров
    int fuelcap; // обьем бака
    int mpg; // расход литров на км

    Vehicle(int p,int f,int m){
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    void range(){
        System.out.println("на растояние " + fuelcap * mpg + " км");
    }
    double fuelneeded(int km){
        return km/mpg;
    }
}