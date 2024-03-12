package Java_Review_Part_2.Polymorphism;

public class MainClass {
    public static void main(String[] args) {
        //Polymorphism = the ability of different objects to respond to the same message or method

        //Sample Objects
        Car car = new Car();
        Bike bike = new Bike();
        Boat boat = new Boat();

        Vehicle[] racers = {car, bike, boat}; //Store them in one Vehicle Array since all of them are extended to the Vehicle Class
        //and considered as Vehicle Objects 

        for(Vehicle x : racers){ //For Loop to define the go() method to each object in the Array
            x.go();
        }
    }
}
