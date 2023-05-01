package com.bridgelabz.userresgistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^(\\+?\\+[0-9]{1,3})+[0-9]{10}+$");

    public static void main(String[] args) {
        String mobileNo= "+919890810104";
        Matcher matcher = pattern.matcher(mobileNo);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
