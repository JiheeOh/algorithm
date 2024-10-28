package computerScience.solid.ISP;

public class Penguin implements CantFly{
    @Override
    public void eat() {
        System.out.println("냠냠");
    }

    /***
     * Bird Interface는 분리가 되어있지 않기 때문에
     * 날지못하는 펭귄도 fly 메소드를 구현해야한다.
     */
//    @Override
//    public void fly() {
//        System.out.println("Can't fly");
//    }
}
