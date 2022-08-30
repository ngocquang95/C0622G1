package ss22_structural._2_facade_pattern.controller;

import ss22_structural._2_facade_pattern.facade.Facade;

public class MainController {
    public static void main(String[] args) {
        Facade facade = new Facade();

        facade.pay("MauHoang@gmail.com");
    }
}
