package com.pat;

public class Main {

    public static void main(String[] args) {

        //step 7 create new password instance
        int pw = 6743312;
        Password password = new Password(pw);
        password.storePassword();
        //then run
        //result;
        //Saving password as 754498426
        //**which is completely different than the number we passed to it

        System.out.println("=========================================");
        //step 8 calling a few methods here
        password.letMeIn(1);
        password.letMeIn(2);
        password.letMeIn(3);
        password.letMeIn(4);
        password.letMeIn(5);
        password.letMeIn(6);
        password.letMeIn(6743312);
        //then run
        //result;
        /*
        No way stranger, get out, you can't come in here!!
        No way stranger, get out, you can't come in here!!
        No way stranger, get out, you can't come in here!!
        No way stranger, get out, you can't come in here!!
        No way stranger, get out, you can't come in here!!
        No way stranger, get out, you can't come in here!!
        Welcome, it's OK that you are here!!!
         */

        //step 8 what happens if someone were to extend storePassword class
        //and change the password itself
        //so let's make a new class ExtendedPassword

    }

}
