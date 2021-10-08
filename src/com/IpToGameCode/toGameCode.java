package com.IpToGameCode;

import java.net.Inet4Address;

public class toGameCode extends Main{
    public String conversion(Inet4Address add){
        System.out.println(add.getHostAddress()); // I also just want to see what this gives us //this shold be it and should work even better
        System.out.println(add.toString()); //this should be enought since we are not doing a revers lookup and only this should give us the deired output
        return "";//todo add something to reutnr
    }
}
