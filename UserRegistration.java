package com.bridgelabz.userresgistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    static Pattern pattern = Pattern.compile("^[A-Z]+[a-z]{2,}+$");

    public static void main(String[] args) {
        String firstName= "Abhc";
        Matcher matcher = pattern.matcher(firstName);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}
