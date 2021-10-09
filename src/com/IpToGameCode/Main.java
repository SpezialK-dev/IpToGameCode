package com.IpToGameCode;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class Main {
    //this package is just here so I can test shit without using stuff like Junit test  because those dont make sense in this szenario
    public static void main(String[] args) {
        //converts a String into an address should be used later aswell
        Inet4Address[] test1 = new Inet4Address[0];
        try {
            test1 = (Inet4Address[]) Inet4Address.getAllByName("255.255.255.0");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        toGameCode.conversion(test1);

    }
}
