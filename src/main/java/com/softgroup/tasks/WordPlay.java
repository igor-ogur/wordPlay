package com.softgroup.tasks;

public class WordPlay {
    public static boolean isVowel (Character ch){
        String vowels = "aeiou";
        if (vowels.contains(ch.toString().toLowerCase())) return true;
        return false;
    }

    public static String replaceVowels (String phrase, Character ch){
        for (int i = 0; i < phrase.length(); i++) {
            if (isVowel(phrase.charAt(i))) phrase = phrase.replace(phrase.charAt(i), ch);
        }
        return phrase;
    }

    public static String emphasize (String phrase, Character ch){
        for (int i = 0; i < phrase.length(); i++) {
            if (String.valueOf(phrase.charAt(i)).toLowerCase().equals(ch.toString().toLowerCase())) {
                if (i % 2 == 0) phrase = phrase.replaceFirst(String.valueOf(phrase.charAt(i)), "*");
                else phrase = phrase.replaceFirst(String.valueOf(phrase.charAt(i)), "+");
            }
        }
        return phrase;
    }
}
