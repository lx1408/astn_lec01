package com.aston.javabase;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class Homework {

    // Перевернуть строку и вывести на консоль
    //  String string = "I love Java";
    public static void turnString(String string) {
        StringBuilder sb = new StringBuilder(string);
        System.out.println(sb.reverse().toString());
    }

    // int[] ints = {1, 2, 2, 3, 4, 5, 5, 6, 7, 8, 8, 9};
    // Удалить дубликаты из массива и вывести в консоль
    public static void getDistinctNumbers(int[] ints) {
        Set<Integer> set = new LinkedHashSet<>();
        for(int i:ints){
            set.add(i);
        }
        Integer[] result = set.toArray(new Integer[0]);
        System.out.println(Arrays.toString(result));
    }

    // Дан массив, заполненный уникальными значениями типа int.
    // int[] arr = {10, 15, 23, 11, 44, 13, 66, 1, 6, 47};
    // Необходимо найти элемент, который меньше максимума, но больше всех остальных.
    public static Integer findSecondMaxElement(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length-2];
    }

    // Найти длину последнего слова в строке. В строке только буквы и пробелы.
    // "Hello world" - 5
    // "    fly me    to the moon    " - 4
    public static Integer lengthOfLastWord(String string) {
        String[] words = string.trim().split("\\s+");
        return words[words.length-1].length();
    }

    // Определить, что строка является палиндромом
    // Сложность по памяти O(1), не создавать новые String, StringBuilder
    // Примеры:
    // abc - false
    // 112233 - false
    // aba - true
    // 112211 - true
    public static boolean isPalindrome(String string) {
        for (int i = 0; i < string.length()/2; i++) {
            if (string.charAt(i) != string.charAt(string.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}

