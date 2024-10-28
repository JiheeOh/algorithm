package computerScience.solid.OCP;

public interface Animal {
    /**
     * 소프트웨어 엔티티(클래스,모듈,함수)는 확장에는 열려 있어야하지만 수정에는 닫혀있어야한다.
     * 기능을 추가하거나 변경할 때 기존 코드를 수정하지 않고 확장하는 방법으로 구현해야한다.
     */
    String say();
}
