package computerScience.solid.DIP;

public class DIPMain {

    public static void main(String[] args) {
        Car car = new Car(new KiaWheel());
        car.go();

    }
}
