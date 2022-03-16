public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle();
        Vehicle sportCar = new Vehicle();

        minivan.passengers = 7; // кол-во пасажиров
        minivan.fuelcap = 50; // обьем бака
        minivan.mpg = 7; // расход литров на км

        sportCar.passengers = 2;
        sportCar.fuelcap = 50;
        sportCar.mpg = 25;

        System.out.print("Минивен может перевезти " + minivan.passengers + " пасажиров ");
        minivan.range();
        System.out.print("Спорткар может перевезти " + sportCar.passengers + " пасажиров ");
        sportCar.range();
    }
}