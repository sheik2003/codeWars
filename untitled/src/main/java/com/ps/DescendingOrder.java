package com.ps;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {

        char[] digits = String.valueOf(num).toCharArray();

        Arrays.sort(digits);
        
        StringBuilder reveresed = new StringBuilder();
        for (int i = digits.length - 1 ; i >= 0 ; i--){
            reveresed.append(digits[i]);
        }
     
        
        return Integer.parseInt(reveresed.toString());
    }
}
