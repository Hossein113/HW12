package maktab74.org.step3;

public class UserServiceImple {

    private UserDAO userDAO ;
    private SecurityService securityService ;

    public void assignPassword (User user) throws Exception {

        String passwordMd5 = securityService.Md5(user.getPassword());
        user.setPassword(passwordMd5);
        userDAO.updateUser(user);

    }
    public  UserServiceImple (UserDAO dao , SecurityService security){
        this.userDAO=dao;
        this.securityService=security;
    }
}
