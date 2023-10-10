package by.lesson.AM_1;

import java.util.Scanner;

public class Main_and_MathOperation {
public static void main(String[]args)
        {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите число 1: ");
        double num1 = in.nextDouble();
        System.out.print("Введите число 2: ");
        double num2 = in.nextDouble();
        System.out.print("Введите число 3: ");
        double num3 = in.nextDouble();
        double result = num1 * num2 * num3;
        System.out.println("Результат = "+result);
        }
        }
