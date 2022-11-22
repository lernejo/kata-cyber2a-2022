package org.example;

public class Main {
    public static void main(String[] args) {
        String chocolate = "\uD83C\uDF6B";
        String cupcake = "\uD83E\uDDC1";
        String candy = "\uD83C\uDF6C";
        String peanut = "\uD83E\uDD5C";


    }
    public static String showCakeName(String cakeName){
        return cakeName;
    }

    // test the showCakeName method
    public static void testShowCakeName() {
        String chocolate = "\uD83C\uDF6B";
        String cupcake = "\uD83E\uDDC1";
        showCakeName(chocolate);
        showCakeName(cupcake);
    }
}


