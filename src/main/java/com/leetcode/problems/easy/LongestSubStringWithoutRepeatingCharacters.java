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
        //getUniqueCharacterSubstringBruteForce("abcabcbb");
        String input="CODINGISAWESOME";
        input="abcabcbb";
        //input=" ";
        input = "abba";
        //String output =unqieCharsLongestSubstring(input);
        String output = unqieCharsLongestSubstringOptimized(input);
        System.out.println("output -> "+output);
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
    String finalSubstring="";
    int size=0;
    for(int i=0;i<input.length();i++) {
        Set<Character> nonrepeatedCharsSet=new HashSet<>();
        String substring="";
        int j=i;
        for(;j<input.length();j++) {
            char c = input.charAt(j);
            if(!nonrepeatedCharsSet.contains(c)) {
                nonrepeatedCharsSet.add(c);
            } else {
                substring=input.substring(i,j);
                break;
            }

        }
        /*if(substring.length()>finalSubstring.length()) {
            finalSubstring=substring;
        }*/

        if(finalSubstring.length() > j-i+1) {
            finalSubstring=input.substring(i,j);
        }
    }

    return finalSubstring;


}

public static String unqieCharsLongestSubstringOptimized(String input) {

    Map<Character,Integer> visited=new HashMap<>();
    String output="";
    for(int start=0,end=0;end<input.length();end++) {
        Character c = input.charAt(end);
        if(visited.keySet().contains(c)) {
            start = Math.max(visited.get(c)+1,start);
        }

        if(output.length() < (end-start+1)) {
            output = input.substring(start,end+1);
        }
        visited.put(input.charAt(end),end);
    }
    return output;
}



}
