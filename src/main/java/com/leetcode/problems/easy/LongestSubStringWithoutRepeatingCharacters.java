package com.leetcode.problems.easy;

import java.util.*;

public class LongestSubStringWithoutRepeatingCharacters  {




    // make each length unique substring
    // gagansuri
    // g, ga, gag, gagan,gagans,gagansu,gagansur,gagansuri




    public static String uniqueLengthSubString(String input){
        Set<String> uniqueSubstrings=new HashSet<>();
        for(int i=0;i<input.length();i++) {

            for(int j=i+1;j<input.length()-1;j++) {
                uniqueSubstrings.add(input.substring(i,j));
            }
        }

        System.out.println("substrings -> "+uniqueSubstrings);
        return "";
    }


    public static void main(String[] args) {
        //uniqueLengthSubString("abcabcbb");
        getUniqueCharacterSubstringBruteForce("abcabcbb");
    }



    public static String getUniqueCharacterSubstringBruteForce(String input) {
        String output = "";
        for (int start = 0; start < input.length(); start++) {
            Set<Character> visited = new HashSet<>();
            int end = start;
            for (; end < input.length(); end++) {
                char currChar = input.charAt(end);
                if (visited.contains(currChar)) {
                    break;
                } else {
                    visited.add(currChar);
                }
            }
            System.out.println("visited->"+visited);
            if (output.length() < end - start + 1) {
                output = input.substring(start, end);
                System.out.println("Start-> "+start +" End -> "+end +" output -> "+output);

            }
        }
        System.out.println("result -> "+output);
        return output;
    }


    /**
     * Start from the first element and keep on adding the characters to the set till they are unique once u get repeated char stop
     *
     * then start from next index and do the same thing
     *
     * keep the output i.e. substring from start to end in a string and keep its lenght
     * check if the new substring in a next iteration is bigger than the previous one, replace it otherwise go to next iteration
     *
     *
     */



public static String unqieCharsLongestSubstring(String input) {
    for(int i=0;i<input.length();i++) {
        for(int j=0;j<input.length();j++) {
        char c = input.charAt(j);
        

        }


    }


}



}
