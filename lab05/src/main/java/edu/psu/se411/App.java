package edu.psu.se411;

import edu.psu.se411.exceptions.InvalidAgeException;
import edu.psu.se411.exceptions.InsufficientFundsException;
import edu.psu.se411.wallet.Wallet;

public class App {

    public static void validateAge(int age) throws InvalidAgeException {

        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older.");
        }

        System.out.println("Age valid");
    }

    public static void main(String[] args) {

        // Exercise 1
        try {
            validateAge(20);
        } catch (InvalidAgeException e) {
            System.out.println("Invalid age: " + e.getMessage());
        }

        // Exercise 2
        Wallet wallet = new Wallet(500);

        try {
            wallet.withdraw(200);
            wallet.withdraw(400);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
        }
    }
}