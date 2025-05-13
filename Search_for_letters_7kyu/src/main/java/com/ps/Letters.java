package com.ps;

public class Letters{
    public static String search(String line){

        StringBuilder associatedWord = new StringBuilder("00000000000000000000000000");
        for (int i = 0; i < line.length(); i++) {
            Character currentChar = line.charAt(i);
            if (Character.isLetter(currentChar)){
                int index = Character.toLowerCase(currentChar) - 'a' ;
                associatedWord.setCharAt(index,'1');
            }

        }


        //Your code here :)
        return associatedWord.toString();
    }
}