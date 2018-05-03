package com.pat;

//step 8 this class
//step 9 extend it from Password
public class ExtendedPassword extends Password{

    //step 10 field or variable
    private int decryptedPassword;

    //step 11 constructor, selected none, but add one manually
    public ExtendedPassword(int password) {
        super(password);
        //step 12 manual add
        this.decryptedPassword = password;
    }

    //step 13 override method
    @Override
    public void storePassword() {
        //super.storePassword();
        System.out.println("Saving password as " + this.decryptedPassword);

        //then go back to main for step 14

    }
}
