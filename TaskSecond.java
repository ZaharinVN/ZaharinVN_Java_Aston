import java.util.Scanner;
/*
2. Написать программу, которая принимает на вход две строки (a и b) и сравнивает их.
В результате сравнения в консоль должно быть выведено одно из сообщений:
"Строки неидентичны" или "Строки идентичны"
*/

class TaskSecond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первую строку: ");
        String firstString = scanner.nextLine();

        System.out.print("Введите вторую строку: ");
        String secondString = scanner.nextLine();

        compareStrings(firstString, secondString);

        scanner.close();
    }

    private static void compareStrings(String a, String b) {
        if (a.equals(b)) {
            System.out.println("С учётом регистра строки идентичны");
        } else {
            System.out.println("С учётом регистра строки неидентичны");
        }

        // Дополнительная проверка на идентичность без учета регистра
        if (a.equalsIgnoreCase(b)) {
            System.out.println("Без учёта регистра строки идентичны");
        } else {
            System.out.println("Без учёта регистра строки не идентичны");
        }
    }
}
