package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.driver.DriverManager;
import com.crowdar.examples.constants.LoginConstants;
import org.testng.Assert;

import static com.crowdar.examples.constants.LoginConstants.EMAIL_INPUT;
import static com.crowdar.examples.constants.LoginConstants.PASSWORD;


public class LoginService {

    public static void doLogin(String email, String password){
        MobileActionManager.setInput(EMAIL_INPUT, email);
        MobileActionManager.setInput(PASSWORD, password);
        MobileActionManager.click(LoginConstants.SIGN_IN_BUTTON);
    }

    public static void isViewLoaded(){
        MobileActionManager.waitVisibility(LoginConstants.SIGN_IN_BUTTON);
        Assert.assertTrue(MobileActionManager.isVisible(EMAIL_INPUT));
    }

}
