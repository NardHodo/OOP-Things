package Java_Review_Part_2.Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat};

        for(Vehicle x : racers){
            x.go();
        }
    }
}
