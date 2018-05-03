package com.pat;

//step 1 made this class
public class Password {

    //step 2 fields or variables
    private static final int key = 748576362;
    private final int encryptedPassword;

    //step 3 constructor for encryptedPassword
    //note this. used when parameter exists
    //public Password(int encryptedPassword) {
    public Password(int password) {
        //then write a function to encrypt password
        this.encryptedPassword = encryptDecrypt(password);
    }

    //step 4 method method
    private int encryptDecrypt(int password) {
        return password ^ key;
    }

    //step 5 method to store password
    //if this was public final void storePassword, no one could extend to change password
    //and the override method would produce an error because it can't be overwritten
    public void storePassword() {

        System.out.println("Saving password as " + this.encryptedPassword);

    }

    //step 6 method to test if password is valid
    public boolean letMeIn(int password) {
        if (encryptDecrypt(password)==this.encryptedPassword) {
            System.out.println("Welcome, it's OK that you are here!!!");
            return true;
        } else {
            System.out.println("No way stranger, get out, you can't come in here!!");
            return false;

            //step 7 to main

        }
    }

}
