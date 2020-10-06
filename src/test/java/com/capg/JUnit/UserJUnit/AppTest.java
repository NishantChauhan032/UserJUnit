package com.capg.JUnit.UserJUnit;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.BeforeClass;
import org.junit.Test;


public class AppTest {

    static App app=null;



    @BeforeClass
    public static void setUp(){
    app=new App();
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
        assertTrue("Invalid Email",app.validateEmail("nishantkr0210@gmail.com"));
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
    
  