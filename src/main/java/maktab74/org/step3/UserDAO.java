package maktab74.org.step3;

public class UserDAO {
    public String updateUser(User user) {
        user.setPassword(user.getPassword());
        return user.getPassword() ;
    }
}
