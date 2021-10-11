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
    //converts the individual number into a string
    public static String ConvertIndividualAddresToWords(String partOfTheAddress){
        //takes the number and converts it into a float and devides that float by 10 so that I can seperate the first and second part later
        float ogPartofAdd=Float.parseFloat(partOfTheAddress);
        String endAdd = Float.toString(ogPartofAdd/10);//this splits it I could have also used Big number but I dont need nay of those functions and this should not take that many cpu cycles to convert this back to an int later

        System.out.println("as a float : " + endAdd);//can be removed later is only there for visual output

        //splitting it into the respectiv numbers
        String splitVal[] = endAdd.split(Pattern.quote("."));//the first part is the hundered digit and the second part is only the first number
        //I can hardcode the valous of the array because I know that they will always be two

        //todo remove the priniting
        System.out.println( "part 1: "+splitVal[0]);
        System.out.println( "part 2: "+splitVal[1]);



        return "";//todo replace this with an actuall return and not just void
    }
}
