
public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Animal animal = bird; //now we know that we can assign the instance variable of a subclass to a variable of the parent class' datatype
        FlightEnabled flier = bird; //similar behaviour is portrayed by instances
        Trackable tracker = bird;
        bird.move();
        animal.move(); //since the move method was originally declared in the animal class, we can execute the method with a variable with datatype Animal. much like we executed Polymorphism
//        flier.move(); //now the flier and the tracker class has no methods named move() in its body and hence, compiler provides an error
//        tracker.move();
        flier.takeoff(); //now, just like any other classes, we can implement the overriden methods
        flier.fly();
        tracker.track();

        //so basically interfaces are like abstract parent classes, only difference being a class can implement multiple interfaces
        //while a class can only extend one parent class

    }
}