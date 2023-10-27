package by.lesson.stringLessons;

import java.util.Scanner;
import java.lang.*;


public class ConcatString {
    public int countSymbols(String str) {
        if (str == null || str.length() == 0) {
            throw new IllegalArgumentException("ОШИБКА! Передана пустая строка!");
        }
        return str.replaceAll("\\s", "").length();
    }

    public boolean isEquals(String str1, String str2) {
        if (str1 == null || str2 == null) {
            throw new IllegalArgumentException("Одна из строк пустая");
        }
        if (str1.equals(str2)) {
            System.out.println("Строки равны");
            return true;
        } else {
            java.time.LocalDateTime currentDateTime = java.time.LocalDateTime.now();
            System.out.println(currentDateTime);
            return false;
        }
    }

    public String concat(String str1, String str2) {
        if (str2 == null || str2.length() == 0) {
            throw new IllegalCallerException("Нельзя клеить т.к вторая строка пустая");
        }
        if (str1 == null || str1.length() == 0) {
            throw new IllegalCallerException("Нельзя клеить т.к первая строка пустая");
        }
        return str1.concat(str2);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите первую строку: ");
        String str1 = in.nextLine();
        System.out.println("Введите вторую строку: ");
        String str2 = in.nextLine();
        ConcatString concatString = new ConcatString();
        int quantity = concatString.countSymbols(str1);
        System.out.println("Количество символов: " + quantity);
        boolean equality = concatString.isEquals(str1, str2);
        String Str1PlusStr2 = concatString.concat(str1, str2);
        System.out.println(Str1PlusStr2);
    }
}
