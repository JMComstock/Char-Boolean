package com.company;

public class Main {

    public static void main(String[] args) {

        //char occupies 2 bytes of memory (16 bits) and has a width of 16
        //chars are 2 bytes to allow the storing of Unicode characters (https://unicode-table.com/) for reference
        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);
        char myCopyrightChar = '\u00A9';
        System.out.println(myCopyrightChar);

        //boolean values allows 2 choices, True or False, Yes or No, 1 or 0
        //JAVA boolean primitive types only allows the True or False values
        boolean myTrueBooleanValue = true;
        boolean myFalseBooleanValue = false;

        boolean isCustomerOverTwentyOne = true;
    }
}
