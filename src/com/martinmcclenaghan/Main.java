package com.martinmcclenaghan;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

     System.out.println(maxRotate(56789));

}

    public static long maxRotate(long n) {

        //convert to string then char array
        String s1 = Long.toString(n);
        char[] ch = s1.toCharArray();

        //number of possible rotations = number of digits - 1
        int digits = countDigits(n);
        int numberOfRot = digits - 1;

        //collect all rotations in an array of char arrays
        char[][] allRotations = new char[digits][digits];
        allRotations[0] = ch;

        for (int i = 1; i <= numberOfRot; i++) {

            allRotations[i] = rotateHoldx(allRotations[i - 1], i - 1);
        }

        //create new string array
        String[] strings = new String[digits];

        for (int i = 0; i < allRotations.length; i++) {

            strings[i] = new String(allRotations[i]);

        }

        //create new long array
        long[] longs = new long[digits];

        for (int i = 0; i < strings.length; i++) {

            longs[i] = Long.parseLong(strings[i]);
        }

        //sort array for max
        Arrays.sort(longs);
        return longs[longs.length - 1];
    }

    public static char[] rotateWhole(char[] chars) {

        //rotates whole number
        char[] rotated = new char[chars.length];
        rotated[chars.length - 1] = chars[0];

        for (int i = 0; i < chars.length - 1; i++) {

            rotated[i] = chars[i + 1];
        }

        return rotated;
    }

    public static char[] rotateHoldx(char[] chars, int numbersToBeHeld) {

        // create new array to be returned
        char[] rotated = new char[chars.length];

        //put numbers not to be rotated into new array
        for (int i = 0; i < numbersToBeHeld; i++) {

            rotated[i] = chars[i];
        }

        // create sub array and rotated it
        char[] rotatedSub = rotateWhole(createNewX(chars, numbersToBeHeld));

        //put rotated sub array into array to be returned.
        for (int i = numbersToBeHeld; i < rotated.length; i++) {

            rotated[i] = rotatedSub[i - numbersToBeHeld];

        }

        return rotated;
    }

    public static char[] createNewX(char[] chars, int numbersToBeHeld) {

        // create sub array to be rotated but with some numbers left unchanged
        char[] tbr = new char[chars.length - numbersToBeHeld];

        for (int i = 0; i < tbr.length; i++) {

            tbr[i] = chars[i + numbersToBeHeld];
        }
        return tbr;
    }

    public static int countDigits(long n) {

        //count digits in given number
        int digits = 0;
        while (n > 0) {
            n /= 10;
            digits++;

        }
        return digits;
    }


}





