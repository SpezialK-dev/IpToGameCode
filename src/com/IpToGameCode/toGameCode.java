package com.IpToGameCode;

import java.net.Inet4Address;
import java.net.InetAddress;

public class toGameCode extends Main{
    public static String conversion(InetAddress add){
        System.out.println(add.getHostAddress()); // I also just want to see what this gives us //this shold be it and should work even better
        String theCurrentIpAddressAsString = add.getHostAddress();
        String IpAddressArray[] = theCurrentIpAddressAsString.split(".");
        return "";//todo add something to reutnr
    }
    public String ConvertIndividualAddresToWords(String partOfTheAddress){
        return "";//todo replace this with an actuall return and not just void
    }
}
