package maktab74.org.step3;

public class SecurityService {
    public String Md5(String password) {
User user = new User();

        return user.setPassword(password);
    }
}
