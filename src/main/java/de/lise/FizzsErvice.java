package de.lise;

import java.util.*;

@SuppressWarnings("AccessStaticViaInstance")
public class FizzsErvice {
    protected Object getBuss() throws InterruptedException {
        Thread.sleep(10);
        SwitchCharkkterAdaptermanagerservice switchCharkkterAdaptermanagerserviceInstanceHandler = new SwitchCharkkterAdaptermanagerservice();
        return new String(switchCharkkterAdaptermanagerserviceInstanceHandler.switschTHeChars("fizz"));
        //return "fizz".replace("f", "F");
    }
}
