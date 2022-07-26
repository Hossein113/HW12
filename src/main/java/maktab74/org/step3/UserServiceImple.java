package maktab74.org.step3;

public class UserServiceImple {

    private UserDAO userDAO ;
    private SecurityService securityService ;

    public String assignPassword (User user){

        String passwprdMd5 = securityService.Md5(user.getPassword());
        user.setPassword(passwprdMd5);
        userDAO.updateUser(user);
return user.getPassword();
    }
    public  UserServiceImple (UserDAO dao , SecurityService security){
        this.userDAO=dao;
        this.securityService=security;
    }
}
