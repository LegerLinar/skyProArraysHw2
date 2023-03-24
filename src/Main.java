public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
    
    public static void task3(){
        System.out.println("Задача 3");
//        Теперь бухгалтерия хочет понять, какую в среднем сумму компания тратила в течение 30 дней.
//Напишите программу, которая посчитает среднее значение трат за месяц (то есть сумму всех трат за месяц поделить на количество дней),
// и выведите в консоль результат в формате: «Средняя сумма трат за месяц составила … рублей».
//Важно помнить: подсчет среднего значения может иметь остаток, то есть быть не целым, а дробным числом.
        int[ ] arr = generateRandomArray();

        float averageExpense = (float) 0;

        for (int i : arr) {
            averageExpense+= i;
        }
        averageExpense /= 30;
        System.out.printf("Средняя сумма трат за месяц составила %.2f рублей\n", averageExpense);
    }

}