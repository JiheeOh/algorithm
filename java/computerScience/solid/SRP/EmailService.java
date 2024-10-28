package computerScience.solid.SRP;

public class EmailService {
    public void sendEmail(User user, String message){
        System.out.println("Sending email to" + user.getEmail());

    }
}
