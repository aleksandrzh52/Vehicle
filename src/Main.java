public class Main {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,50,7);
        Vehicle sportCar = new Vehicle(2,50,25);

        int km = 100;

        System.out.print("Минивен может перевезти " + minivan.passengers + " пасажиров ");
        minivan.range();
        System.out.println("Для преодоления "+ km +
                " км мини-фургону требуется " +
                minivan.fuelneeded(km) +" литров топлива");

        System.out.print("Спорткар может перевезти " + sportCar.passengers + " пасажиров ");
        sportCar.range();
        System.out.println("Для преодоления " + km +
                " км спортивному автомобилю требуется " +
                sportCar.fuelneeded(km) +" литра топлива");

    }
}