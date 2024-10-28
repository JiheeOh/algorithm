package computerScience.solid.DIP;

public class Car {
    private Wheel wheel;


    public  Car (KiaWheel wheel) {
        this.wheel = wheel;
    }

    //            // DIP 위배
//            KiaWheel wheel1 = new KiaWheel();
//            wheel1.go();
    public void go() {
        // DIP 지키기
        wheel.go();
    }
}
