package com.greatlearning.credservice;

import com.greatlearning.details.Employee;
import java.util.Random;

public class Credentials {
    public char[] generatePassword() {
        String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*<>+/-=";
        String values = capitalLetters + smallLetters + numbers + specialCharacters;
        Random random = new Random();
        char[] password = new char[8];
        for(int i=0; i<password.length; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
            // The method charAt() accepts index as a parameter. 
            // The starting index is 0. It returns a character at a specific index position in a string.
        }
        return password;
    }
    public String generateEmailAddress(String firstName, String lastName, String department) {
        String email = firstName + lastName + "@" + department + ".abc.com";
        return email;
    }
    public void showCredentials(Employee employee, String email, char[] password) {
        System.out.println("Dear " + employee.getFirstName() + " your generated credentials are as follows");
        System.out.println("Email    ---> " + email);
        System.out.print("Password ---> ");
        System.out.println(password);
        System.out.print("\n");
    }
}