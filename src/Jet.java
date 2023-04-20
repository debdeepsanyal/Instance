public class Jet implements FlightEnabled,Trackable{ //now a Jet and a bird has little in common except that both has wings and both are trackable. interfaces help us to treat both jets and birds similarly in the client code

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
