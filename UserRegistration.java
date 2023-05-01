package com.bridgelabz.userresgistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+\\.+[A-Za-z0-9+_.-]+@(?:[a-z])+(?:\\.[a-zA-Z]{2})+(?:\\.[a-zA-Z]{2})?$");

    public static void main(String[] args) {
        String Email= "abc.xyz@bl.co.in";
        Matcher matcher = pattern.matcher(Email);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
