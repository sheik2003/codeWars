package com.ps;

import java.sql.Array;
public class Solution {


    public class Kata {

        public static int[] rowWeights (final int[] weights)
        {
            int[] results = new int[2];

            for (int i = 0; i < weights.length; i++) {

                if(i % 2 == 0){
                    results[0] += weights[i];
                }else{
                    results[1] += weights[i];
                }

            }
            return results;
        }

    }



}
