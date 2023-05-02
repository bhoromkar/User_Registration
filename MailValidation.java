package com.bridgelabz.userresgistration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class MailValidation {
    //static Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+\\.+[A-Za-z0-9+_.-]+@(?:[a-z])+[(\\.[a-zA-Z]{2})+(\\.[a-zA-Z]{2})?]$");
    static Pattern pattern = Pattern.compile("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");

    public static void main(String[] args) {
        String Email= "abc.100@abc.com.au";
        Matcher matcher = pattern.matcher(Email);
        if (matcher.matches()) {
            System.out.println("Valid");
        }
        else {
            System.out.println("Invalid");
        }
    }
}


