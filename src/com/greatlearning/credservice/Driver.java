package com.greatlearning.credservice;

import com.greatlearning.details.Employee;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter First Name : ");
        String firstName = sc.nextLine();
        System.out.print("Enter Last Name : ");
        String lastName = sc.next();
        System.out.println("Please enter the department from the following ");
        System.out.println("1. Technical");
        System.out.println("2. Admin");
        System.out.println("3. Human Resource");
        System.out.println("4. Legal");
        int option = sc.nextInt();
        String generatedEmail;
        char[] generatedPassword;
        Employee employee = new Employee(firstName, lastName);
        Credentials cs = new Credentials();
        if(option == 1) {
            generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "tech");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if(option == 2) {
            generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if(option == 3) {
            generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else if(option == 4) {
            generatedEmail = cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
            generatedPassword = cs.generatePassword();
            cs.showCredentials(employee, generatedEmail, generatedPassword);
        }
        else {
            System.out.println("Please enter a valid option");
        }
    }
}