package maktab74.org.test.step3;

import maktab74.org.step3.SecurityService;
import maktab74.org.step3.User;
import maktab74.org.step3.UserDAO;
import maktab74.org.step3.UserServiceImple;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class UserServiceImpleTest{
    @Mock
    UserDAO userDAO;
    @Mock
    SecurityService securityService;
    UserServiceImple updateUser;

    @Test
    void getNewPasswordTest(){
User user = new User() ;
user.setPassword("123");
user.setUserName("Ali");

        when(updateUser.assignPassword(user)).thenReturn("123");
        String password = securityService.Md5(user.getPassword());
        assertEquals("123",password);
    }
}
