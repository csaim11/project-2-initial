package com.sandbox.exception;

import java.util.Scanner;

public class ExceptionActivity {
    private static void main(String[] args) {
        // Section 1 - try-catch
        // try-catch
        try {
            // happy path - all this executes if no exception thrown
        } catch (Exception e) {
            // sad path - exception thrown
            e.printStackTrace();
        }
        // do more stuff

        // Section 2 - try-catch-catch

        // try-catch-catch - order of catch blocks matters per hierarchy
        try {
            // Do something here
        } catch (NullPointerException e) {
            // we'll catch the NullPointerException here and handle it differently than other exceptions
        } catch (Exception e) {
            e.printStackTrace();
        }
        // do more stuff


        //Section 3 - try-catch-finally

        try {
            // do something
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // always do something
        }
        // do yet more stuff


        //Section 4 - try-finally

        try {
            // do something we don't expect to throw exceptions
        } finally {
            // but if we do, always execute code here
        }
        // more stuff here


        //Section 5 - multi-try-catch

        // java 7 multi-try-catch
        try {
            // lets do something here
        } catch (ArithmeticException | NullPointerException e) {
            // when either of the exceptions are thrown, do this
            e.printStackTrace();
        }
        // yep, you guessed it - more stuff


        //Section 6 - try-with-resources

        // try-with-resources
        try(Scanner scanner1 = new Scanner(System.in)){
            // do something with scanner1
        }


    }
}
