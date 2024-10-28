package computerScience.solid.Liskov;

public class LisckovMain {
    /**
     * 서브타입은 언제나 기반 타입으로 교체할 수 있어야한다.
     */
    public static void main(String[] args) {
        Parent parent = new Parent();
        parent.say();

        parent = new Child();
        parent.say();

    }
}
