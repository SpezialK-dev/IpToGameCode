package com.IpToGameCode;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Main {
    //this package is just here so I can test shit without using stuff like Junit test  because those dont make sense in this szenario
    public static void main(String[] args) {
        //converts a String into an address should be used later aswell
        InetAddress test1= null;

        try {
            test1 = InetAddress.getByName("155.122.32.0");
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        String currnetG = toGameCode.conversion(test1);
        System.out.println("the final address as an InetAddress"+ GameCodeToIp.convertoInet(currnetG));
    }
}
