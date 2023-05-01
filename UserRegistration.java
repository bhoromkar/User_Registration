package com.bridgelabz.userresgistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[a-zA-Z0-9.,@#$%^&*><|_%+-]{8,}+$");

    public static void main(String[] args) {
        String password= "dlnv568mdvlm";
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
