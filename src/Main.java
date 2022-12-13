import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nДомашнее задание Массивы 2");
        task1();
//
    }

    //  Задача 1 Cумма всех выплат за месяц
    public static int[] generateRandomArray() {     // Объявить метод «сгенерировать массив трат за месяц»
            java.util.Random random = new java.util.Random();
                int[] spending = new int[30];
                for (int i = 0; i < spending.length; i++) {
                    spending [i] = random.nextInt(100_000) + 100_000;
                }
    return spending;
    }

    public static void task1() {
        System.out.println("\nЗадача 1 Cумма всех выплат за месяц");
        int[] dailySpending = generateRandomArray();    // Инициализируем массив дневных трат для бухгалтерии
        System.out.println(Arrays.toString(dailySpending));
        int monthSpending = 0;
        for (final int daily: dailySpending ) {
            monthSpending += daily;
        }
        System.out.println("Сумма трат за месяц составила " + String.format("%,d", monthSpending) + " рублей");
    }
}