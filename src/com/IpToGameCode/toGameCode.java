package com.IpToGameCode;

import java.net.InetAddress;
import java.util.regex.Pattern;

public class toGameCode extends Main{
    public static String conversion(InetAddress add){
        //ussless print command
        System.out.println(add.getHostAddress()); // I also just want to see what this gives us //this shold be it and should work even better

        //converts the Address objket into a string so that I can use it later also splits it into its own parts
        String theCurrentIpAddressAsString = add.getHostAddress();
        String IpAddressArray[] = theCurrentIpAddressAsString.split(Pattern.quote("."));

        //iterates through every part of the ip and then uses it
        for (String currnetInput: IpAddressArray) {
            System.out.println("the current Number : " + currnetInput);
            ConvertIndividualAddresToWords(currnetInput);
        }

        return "";//todo add something to reutnr
    }
    public static String ConvertIndividualAddresToWords(String partOfTheAddress){
        //takes the number and converts it into a float and devides that float by 10 so that I can seperate the first and second part later
        float ogPartofAdd=Float.parseFloat(partOfTheAddress);
        float endAdd = ogPartofAdd/10;
        System.out.println("as a float : " + endAdd);//can be removed later is only there for visual output


        return "";//todo replace this with an actuall return and not just void
    }
}
