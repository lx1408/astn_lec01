package com.aston.javabase;

public class Main {
    public static void main(String[] args) {
        Homework.turnString("I love you");
        Homework.getDistinctNumbers(new int[]{1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9});
        int secondMaxElement = Homework.findSecondMaxElement(new int[]{10, 15, 23, 11, 44, 13, 66, 1, 6, 47});
        System.out.println(secondMaxElement);
        Integer wordLength = Homework.lengthOfLastWord("    fly me    to the moon    ");
        System.out.println(wordLength);
        boolean isPalindrome = Homework.isPalindrome("1122332211");
        System.out.println(isPalindrome);
    }
}

