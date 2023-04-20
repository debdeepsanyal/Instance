interface FlightEnabled{
    public abstract void takeoff(); //we cannot declare an interface method with a protected access modifier. only concrete methods can have private access modifiers
    abstract void land();
    void fly(); //for an interface, public and abstract is implicitly declared, i.e. its the default for interfaces much like the default access modifier for classes is private
}

interface Trackable{
    void track();
}
public abstract class Animal {
    public abstract void move();

}
