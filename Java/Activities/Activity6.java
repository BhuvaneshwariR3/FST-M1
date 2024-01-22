package activities;

public class Activity6 {

    public static void main(String[] args) throws InterruptedException {
        Plane flight = new Plane(10);
        flight.onboard("Tom");
        flight.onboard("Tim");
        flight.onboard("Trace");

        System.out.println("Plane took off at: " + flight.takeOff());

        System.out.println("People on the plane: " + flight.getPassengers());

        Thread.sleep(5000);
        //Plane has landed
        flight.land();
        //Plane lands
        System.out.println("Plane landed at: " + flight.getLastTimeLanded());
        System.out.println("People on the plane after landing: " + flight.getPassengers());
    }
}
