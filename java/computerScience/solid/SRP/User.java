package computerScience.solid.SRP;

public class User {

    private String name;
    private String email;

    public User(String name, String email){
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserInfo(){
        return "name"+name+", emaill : "+email;
    }

    /**
     * SRP 단일 원칙 위배
     * 사용자 정보 관리와 이메일 전송이라는 두가지 책임을 가지면 안된다.
     * 이메일 전송은 따로 분리해야한다.
     */
//    public void sendEmail(){
//        System.out.println("Send email process");
//    }

}
