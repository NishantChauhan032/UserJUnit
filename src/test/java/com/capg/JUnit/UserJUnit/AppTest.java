package com.capg.JUnit.UserJUnit;
import static org.junit.Assert.*;
import java.util.*;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class AppTest {
private boolean mailValid;
private String Email;

    static App app=null;

    public AppTest(String Email,boolean mailValid) {
        super();
        this.Email=Email;
        this.mailValid=mailValid;

    }


    @BeforeClass
    public static void setUp(){
    app=new App();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> input() {
        return Arrays.asList(new Object[][] {{"abc@yahoo.com", true}, {"abc-100@yahoo.com",true},
                {"abc.100@yahoo.com",true},
                {"abc111@abc.com",true},
                {"ac.100@abc.com.au",true},
                {"abc@1.com",true},
                {"abc@gmail.com.com",true},
                {"abc+100@gmail.com",true}});

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
        assertTrue("Invalid Password",app.validatePassword("Wtmpjgj1123#"));
        assertFalse("Valid Password",app.validatePassword("hvkhg@#4jcW"));
    }
}
    
  