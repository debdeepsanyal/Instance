public class Bird extends Animal implements FlightEnabled,Trackable{// it is worth noting that Java only allows a class to extend a single class, hence is single inheritance
    //however, a class can implement multiple instances while extending another class
    //like we know that inheritance has a "is a" relationship, composition has a "has a" relationship, interfaces have a "is" relationship.
    //like in this example, Bird is an Animal and is FLightEnabled and is Trackable
    @Override
    public void move() {
        System.out.println("Flaps wings");
    }

    @Override
    public void takeoff() { //similar to an abstract class, an interface requires any classes which implement it to execute the abstract methods on the interface
        System.out.println(this.getClass().getSimpleName() + " has taken off");
    }

    @Override
    public void land() {
        System.out.println(this.getClass().getSimpleName() + " has landed");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + "is flying");

    }

    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " co ordinates have been recorded");

    }
}
