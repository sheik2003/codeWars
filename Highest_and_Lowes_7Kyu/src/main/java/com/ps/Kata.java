package com.ps;

public class Kata {
    public static String highAndLow(String numbers) {
        //
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String[] numbersParsed = numbers.split(" ");
        for (int i = 0; i < numbersParsed.length; i++) {


            int convertedNumber = Integer.parseInt(numbersParsed[i]);
            if (convertedNumber < min){
                min = convertedNumber;
            } if (convertedNumber > max) {
                max = convertedNumber;
            }

        }
        return max + " " + min;
    }

}