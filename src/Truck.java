public class Truck implements Trackable{
    @Override
    public void track() {
        System.out.println(this.getClass().getSimpleName() + " co ordinates have been recorded");

    }
}
