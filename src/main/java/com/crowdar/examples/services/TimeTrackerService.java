package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.TimeTrackerConstants;
import io.cucumber.java.bs.A;
import org.testng.Assert;

import static com.crowdar.examples.constants.TimeTrackerConstants.*;


public class TimeTrackerService {

    public static void clikStarTime() {
        MobileActionManager.click(INIT_TIME);
    }

    public static void cargaHoras() {
        MobileActionManager.click(NUMBER_HS_INIT);
        MobileActionManager.click(TIME_END);
        MobileActionManager.waitVisibility(NUMBER_HS_FIN);
        MobileActionManager.click(NUMBER_HS_FIN);
    }

    public static void btnSave() {
        MobileActionManager.click(BTN_SAVE);
    }

    public static void selectProject() {
        MobileActionManager.waitVisibility(SELECT_PROJECT);
        MobileActionManager.click(SELECT_PROJECT);
        MobileActionManager.waitVisibility(NAME_PROJECT);
        MobileActionManager.click(NAME_PROJECT);
    }

    public static void verifySave() {
        MobileActionManager.waitVisibility(VERIFY_TODAY);
        Assert.assertTrue(MobileActionManager.getText(VERIFY_TODAY).equalsIgnoreCase("Today"));
    }
}
