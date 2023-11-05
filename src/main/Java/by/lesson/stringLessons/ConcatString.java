package by.lesson.stringLessons;

import java.util.Scanner;
import java.lang.*;


public class ConcatString {
    private void sravnenieStr(String str1, String str2) {
        if (str1 == null || str1.isEmpty()) {
            throw new IllegalCallerException("Первая строка пустая");
        }
        if (str2 == null || str2.isEmpty()) {
            throw new IllegalCallerException("Вторая строка пустая");
        }
    }
    private void sravnenieStr1(String str1) {
        if (str1 == null || str1.isEmpty()) {
            throw new IllegalCallerException("Невозможно посчитать кол-во символов т.к. строка пустая");
        }
    }

    public int countSymbols(String str1) {
        sravnenieStr1(str1);
        return str1.replaceAll("\\s", "").length();
    }
    public boolean isEquals(String str1, String str2) {
        sravnenieStr(str1, str2);
        if (str1.equals(str2)) {
            System.out.println("Строки равны");
            return true;
        } else {
            System.out.println(java.time.LocalDateTime.now());
            return false;
        }
    }

    public String concat(String str1, String str2) {
        sravnenieStr(str1, str2);
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
