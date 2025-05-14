package com.ps;

import java.time.Period;

public class Kata {

/*
* Trolls are attacking your comment section!

A common way to deal with this situation is to remove all of the vowels from the trolls' comments, neutralizing the threat.

Your task is to write a function that takes a string and return a new string with all vowels removed.

For example, the string "This website is for losers LOL!" would become "Ths wbst s fr lsrs LL!".

Note: for this kata y isn't considered a vowel.
*
* */
        public static String disemvowel(String str) {

            StringBuilder removedWord = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                Character currentChar = str.charAt(i);
                if (currentChar != 'a' && currentChar != 'e' && currentChar != 'i' &&
                        currentChar != 'o' && currentChar != 'u' &&
                        currentChar != 'A' && currentChar != 'E' && currentChar != 'I' &&
                        currentChar != 'O' && currentChar != 'U')
                {
                    {
                        removedWord.append(currentChar);

                    }
                }


            }
            return removedWord.toString();
        }

}
