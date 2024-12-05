package org.example;


import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        System.out.println(checkForPalindrome("I did, did I?"));

        WorkintechList workintechList = new WorkintechList();

    }

    public static boolean checkForPalindrome(String str){
        String edit = str.replaceAll("\\p{Punct}", "").trim().toLowerCase().replaceAll(" ","");
        System.out.println(edit);

        LinkedList<Character> charList = new LinkedList<>();
        for(char c: edit.toCharArray()){
            charList.add(c);
//            System.out.println(charList);
        }

        while(charList.size()>1){
            if(!charList.pollFirst().equals(charList.pollLast())){
                return false;
            }
        }

        return true;

    }

    public static String convertDecimalToBinary(int decimal){
        LinkedList<Integer> binaryList = new LinkedList<>();

        while(decimal>0){
            int remainder = decimal % 2;
            binaryList.addFirst(remainder);
            decimal = decimal/2;
        }
        StringBuilder binaryString = new StringBuilder();
        for (int digit: binaryList){
            binaryString.append(digit);

        }
        return binaryString.toString();
    }
}