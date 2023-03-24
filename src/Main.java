public class Main {

    public static void main(String[] args) {
        task1();
        task2();
    }
    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

//    в начале каждой задачи
//int[ ] arr = generateRandomArray();

    public static void task1 () {
        System.out.println("Задача 1");
//        ... // Бухгалтеры попросили посчитать сумму всех выплат за месяц.
//Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
// «Сумма трат за месяц составила … рублей».
        int[ ] arr = generateRandomArray();

        int totalMonthSum = 0;

        for (int i : arr) {
            totalMonthSum += i;
        }
        System.out.printf("Сумма трат за месяц составила %d рублей\n", totalMonthSum);
    }

    public static void task2 () {
        System.out.println("Задача 2");
//         Также бухгалтерия попросила найти минимальную и максимальную трату за день.
//Напишите программу, которая решит эту задачу, и выведите в консоль результат в формате:
// «Минимальная сумма трат за день составила … рублей. Максимальная сумма трат за день составила … рублей».
        int[ ] arr = generateRandomArray();
        int maxSpent = arr[0];
        int minSpent = arr[0];
        for (int i : arr) {
            if (maxSpent<i) {
                maxSpent = i;
            }
        }
        for (int i : arr) {
            if (minSpent>i) {
                minSpent = i;
            }

        }
        System.out.printf("Минимальная сумма трат за день составила %d рублей. Максимальная сумма трат за день составила %d рублей\n", minSpent, maxSpent);
    }
}