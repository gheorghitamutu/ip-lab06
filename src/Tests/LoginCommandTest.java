package Tests;

import Sources.LoginCommand;
import org.junit.Test;

import static org.junit.Assert.*;

public class LoginCommandTest {

    @Test
    public void loginTestSuccess() {
        assert(new LoginCommand().login("test", "test"));
    }

    @Test
    public void loginTestFail() {
        assert(new LoginCommand().login("test_fail", "test_fail"));
    }
}