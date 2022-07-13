package com.Stringstr;

public class Easy002lengthOfLastWord {
    public int lengthOfLastWord(String s){
        int index = s.length()-1;
        while (s.charAt(index)==' '){
            index--;
        }
        int wordlength = 0;
        while (index>=0&& s.charAt(index)!=' '){
            wordlength++;
            index--;
        }
        return wordlength;
    }
    public int lengthOfLastWord01(String s){
        s.trim();
        return s.length() - s.lastIndexOf(' ')-1;
    }
}
