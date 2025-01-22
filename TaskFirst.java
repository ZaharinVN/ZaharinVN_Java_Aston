import java.util.Scanner;
/*
1. Написать программу, которая принимает на вход два целых числа (a и b) и совершает с ними следующие действия:
- сравнивает эти два числа и возвращает результат сравнения путем вывода в консоль одного из вариантов: "a > b", "a < b" или "a = b";
- совершает с этими числами операции сложения, вычитания, деления и умножения и результат выводит в консоль.
 */

class TaskFirst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число a: ");
        int a = scanner.nextInt();

        System.out.print("Введите число b: ");
        int b = scanner.nextInt();

        compareNumbers(a, b);
        performCalculations(a, b);

        scanner.close();
    }

    private static void compareNumbers(int a, int b) {
        if (a > b) {
            System.out.println("a > b");
        } else if (a < b) {
            System.out.println("a < b");
        } else {
            System.out.println("a = b");
        }
    }

    private static void performCalculations(int a, int b) {
        System.out.println("Сумма чисел = " + (a + b));
        System.out.println("Разница чисел = " + (a - b));

        // Обработка деления на ноль
        if (b != 0) {
            System.out.println("Частное чисел = " + ((double) a / b)); // Приведение к double для точного результата
        } else {
            System.out.println("Деление на ноль невозможно.");
        }

        System.out.println("Произведение чисел = " + (a * b));
    }
}

