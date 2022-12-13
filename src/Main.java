import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("\nДомашнее задание Массивы 2");
        task1();        // Задачи 1-3 ввиду унификации генерации массива ежедневных трат
        task4();        // Задача 4 фамилии и имена сотрудников в корректном виде
    }

    //  Задача 1 Общие выплаты за месяц
    public static int[] generateRandomArray() {     // Объявить метод «сгенерировать массив трат за месяц»
            java.util.Random random = new java.util.Random();
                int[] spending = new int[30];
                for (int i = 0; i < spending.length; i++) {
                    spending [i] = random.nextInt(100_000) + 100_000;
                }
    return spending;
    }

    public static void task1() {
        System.out.println("\nЗадача 1 Общая расход на выплаты за месяц");
        int[] dailySpending = generateRandomArray();    // Инициализируем массив дневных трат для бухгалтерии
        System.out.println(Arrays.toString(dailySpending));
        int monthSpending = 0;
        for (final int daily: dailySpending ) {
            monthSpending += daily;
        }
        System.out.println("Сумма трат за месяц составила " + String.format("%,d", monthSpending) + " рублей");

        System.out.println("\nЗадача 2 Минимальная и максимальная сумма трат за месяц");
        // Рассчитываем в этом же методе при одинаковой генерации случайных трат в одном методе
        int minSpending = dailySpending [0];
        int maxSpending =  dailySpending [0];
        for (final int daily: dailySpending ) {
            if ( daily > maxSpending ) {    // Определяем максимальые дневные затраты
                maxSpending = daily;
            }
            if (  daily < minSpending ) {    // Определяем минимальные дневные затраты
                minSpending = daily;
            }

        }
        System.out.println("Минимальная сумма трат за день составила " + String.format("%,d", minSpending) + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + String.format("%,d", maxSpending) + " рублей");

        System.out.println("\nЗадача 3 Среднедневная сумма трат за месяц");
        // Рассчитываем в этом же методе при одинаковой генерации случайных трат в одном методе
        double averageSpending = (float) monthSpending / ( dailySpending.length - 1);

        System.out.println("Средняя сумма трат за месяц составила " + String.format("%1$,.2f", averageSpending) + " рублей");
    }


    public static void task4() {
        System.out.println("\nЗадача 4 фамилии и имена сотрудников в корректном виде");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};

        for ( int i = reverseFullName.length -1; i >=0; i--) {
            System.out.print(reverseFullName [i]);
        }
        System.out.println();
    }
}