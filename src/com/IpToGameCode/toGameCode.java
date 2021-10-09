package com.IpToGameCode;

import java.net.Inet4Address;

public class toGameCode extends Main{
    public static String conversion(Inet4Address add[]){
        System.out.println(add[0].getHostAddress()); // I also just want to see what this gives us //this shold be it and should work even better
        System.out.println(add.toString()); //this should be enought since we are not doing a revers lookup and only this should give us the deired output
        String theCurrentIpAddressAsString = add[0].getHostAddress();
        String IpAddressArray[] = theCurrentIpAddressAsString.split(".");
        return "";//todo add something to reutnr
    }
    public String ConvertIndividualAddresToWords(String partOfTheAddress){
        return "";//todo replace this with an actuall return and not just void
    }
}
