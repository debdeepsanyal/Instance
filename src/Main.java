
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird; //now we know that we can assign the instance variable of a subclass to a variable of the parent class' datatype
//        FlightEnabled flier = bird; //similar behaviour is portrayed by instances
//        Trackable tracker = bird;
        bird.move();
        animal.move(); //since the move method was originally declared in the animal class, we can execute the method with a variable with datatype Animal. much like we executed Polymorphism
//        flier.move(); //now the flier and the tracker class has no methods named move() in its body and hence, compiler provides an error
//        tracker.move();
//        flier.takeoff(); //now, just like any other classes, we can implement the overriden methods
//        flier.fly();
//        tracker.track();
        inFlight(bird);
        inFlight(new Jet());
        Truck truck = new Truck();
        truck.track();

        //so basically interfaces are like abstract parent classes, only difference being a class can implement multiple interfaces
        //while a class can only extend one parent class

    }
    private static void inFlight(FlightEnabled flier){ //now we have passed birds as the argument. the argument here checks is bird is FlightEnabled
        flier.land();
        flier.takeoff();
        if(flier instanceof Trackable trackable){ //this here checks if bird, apart from being FlighEnabled, is also Trackable, and if so implements the method .track();
            trackable.track();
        }
    }
    //it is worth noting that the bird interface here can be used individually as a type of Animal class, executing only the move method
    //or as a FlightEnabled type, only executing takeoff, fly and land methods or even as a Trackable type, executing the track method.
    //A Jet here can be used a FlightEnabled and Trackable type but definitely not as an Animal type, since Jets cant move.
    //A Truck can be used only as a Trackable type, executing track method since a Truck can neither move like animals as such or takeoff, land or fly
}