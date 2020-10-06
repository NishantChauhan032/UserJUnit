package com.capg.JUnit.UserJUnit;
import org.junit.Test;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

@RunWith(Parameterized.class)
public class AppTest {
private String Email;

    static App app=null;

    public AppTest(String Email) {
        super();
        this.Email=Email;

    }


    @BeforeClass
    public static void setUp(){
    app=new App();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com"}, {"abc-100@yahoo.com"},
                {"abc.100@yahoo.com"},
                {"abc111@abc.com"},
                {"ac.100@abc.com.au"},
                {"abc@1.com"},
                {"abc@gmail.com.com"},
                {"abc+100@gmail.com"}});

    }
    @Test
    public void givenName_WhenProper_ShouldReturnTrue()
    {
        assertTrue("Invalid Name",app.validateName("Nishant"));
        assertFalse("Valid Name",app.validateName("nishh"));

    }

    @Test
    public void givenEmail_WhenProper_ShouldReturnTrue()
    {
        assertTrue("Invalid Email",app.validateEmail(Email));
        assertFalse("Valid Email",app.validateEmail("nishajh@hj.cj65"));
    }

    @Test
    public void givenMobile_WhenProper_ShouldReturnTrue()
    {
        assertTrue("Invalid Mobile No",app.validateMobile("91 9835386977"));
        assertFalse("Valid Mobile",app.validateMobile("86784"));
    }
    @Test
    public void givenPassword_WhenProper_ShouldReturnTrue()
    {
        assertTrue("Invalid Password",app.validatePassword("Wuyruy35@"));
        assertFalse("Valid Password",app.validatePassword("86784"));
    }


    
}
    
  