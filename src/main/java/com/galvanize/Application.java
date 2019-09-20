package com.galvanize;

public class Application {

    public static void main(String[]args) {

        System.out.println("Hello world");
    }
    boolean  isActive = false;
        boolean isActive (String status){


            if (status.equals("Active")) {
                System.out.println("True");
            } else if (status.equals("Inactive")) {
                System.out.println("False");

            }
            return isActive;
        }

}
