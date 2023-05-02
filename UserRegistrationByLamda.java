package com.bridgelabz.userresgistration;

public class UserRegistrationByLamda {


        public static void main(String[] args) {

            String firstName = "Jon";
            String lastName = "Doe";
            String email = "johndoe@example.com";
            String mobile = "+911234567890";
            String password = "Passw0rd%";

            IValidateFunction<String> validateFirstName = (String input) -> input.matches("[A-Za-z]{3,}+");
            IValidateFunction<String> validateLastName = (String input) -> input.matches("[A-Za-z]{3,}+");
            IValidateFunction<String> validateEmail = (String input) -> input.matches("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$");
            IValidateFunction<String> validateMobile = (String input) -> input.matches("^(\\+?\\+[0-9]{1,3})+[0-9]{10}+$");
            IValidateFunction<String> validatePassword = (String input) -> input.matches("^(?=.*[A-Z])(?=.*[0-9])(?=.*[a-z])(?=.*[!@#$%^&*><])[a-zA-Z0-9.,@#$%^&*><|_%+-]{8,}+$");


            System.out.println(validateFirstName.register(firstName));
            System.out.println(validateLastName.register(lastName));
            System.out.println(validateEmail.register(email));
            System.out.println(validateMobile.register(mobile));
            System.out.println(validatePassword.register(password));

        }
    }



