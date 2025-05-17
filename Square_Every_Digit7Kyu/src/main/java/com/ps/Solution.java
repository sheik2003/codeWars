package com.ps;

public class Solution {

    public int squareDigits(int n) {

        StringBuilder answer = new StringBuilder();
        String convertedNum = String.valueOf(n);

        for (int i = 0; i <convertedNum.length(); i++) {
        int currentDigit = Character.getNumericValue(convertedNum.charAt(i));
        answer.append(currentDigit*currentDigit);
        }



            return Integer.parseInt(answer.toString());
    }


}
