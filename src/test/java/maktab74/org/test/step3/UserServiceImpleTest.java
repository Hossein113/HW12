package maktab74.org.test.step3;

import maktab74.org.step3.SecurityService;
import maktab74.org.step3.User;
import maktab74.org.step3.UserDAO;
import maktab74.org.step3.UserServiceImple;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

public class UserServiceImpleTest {

    UserServiceImple userService;
    @Mock
    UserDAO userDAO;
    @Mock
    SecurityService securityService;

    @Test
    void getNewPasswordTest() throws Exception {
        userService = new UserServiceImple(userDAO, securityService);
        User usetTest = new User();
        usetTest.setPassword("123");
        when(securityService.Md5(usetTest.getPassword())).thenReturn(usetTest.getPassword());
        doNothing().when(userDAO).updateUser(usetTest);
        userService.assignPassword(usetTest);
    }

    @BeforeEach
    void beforeMokito() {
        MockitoAnnotations.initMocks(this);
    }
}

