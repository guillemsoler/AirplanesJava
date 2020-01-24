package com.suner;

import java.io.UnsupportedEncodingException;

public class Start {
    Menus menu = new Menus();

    public void ShowAirTrafficControllerMenu() throws UnsupportedEncodingException {
        AirTrafficController airTrafficController = new AirTrafficController();
        menu.AirTrafficControllerMenu(airTrafficController);
    }
}
