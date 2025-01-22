/*
3. Задан массив целых чисел: [1, 2, 3, 4, 5, 6, 7, 8, 9,10]
необходимо написать программу, которая выведет в консоль все чётные числа.
*/

class TaskThird {
    public static void main(String[] args) {
        // Инициализация массива с числами от 1 до 10
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Четные числа: ");
        // Вывод четных чисел в одном цикле
        for (int number : newArray) {
            if (number % 2 == 0) {
                System.out.print(number + " ");
            }
        }
    }
}

