import java.util.Random;

public class Main {
    public static void main(String[] args) {
        //Задача 1
        double storage1 = 0;
        short monthToGoal1 = 0;

        System.out.println("Копим деньги до 2 459 000 рублей. Счет = 0. Ежемесячный вклад = 15 000. 12% годовых");

        while (storage1 < 2_459_000) {
            storage1 += 15_000;
            monthToGoal1++;

            System.out.printf("\nМесяц %d, сумма накоплений равна %.2f рублей", monthToGoal1, storage1);
        }

        //Задача 2
        System.out.print("\n\n");

        byte temp = 1;

        while (temp <= 10) {
            System.out.printf("%d ", temp);
            temp++;
        }

        System.out.println();

        for (temp = 10; temp >= 1; temp--) {
            System.out.printf("%d ", temp);
        }

        //Задача 3
        int total = 12_000_000;
        byte birthRate = 17;
        byte deathRate = 8;

        System.out.println("\n\nВысчитываем численность населения.");

        for (short i = 2000; i < 2010; i++) {
            total += (birthRate - deathRate) * (total / 1000);

            System.out.printf("Год %d, численность населения составляет %d\n", i, total);
        }

        //Задача 4
        double storage2 = 15_000;
        int monthToGoal2 = 0;

        System.out.println("\n\nКопим деньги до 12 000 000 рублей.");

        while (storage2 <= 12_000_000) {
            storage2 += storage2 * 0.07;
            monthToGoal2++;

            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", monthToGoal2, storage2);

        }

        //Задача 5
        double storage3 = 15_000;
        int monthToGoal3 = 0;

        System.out.println("\n\nКопим деньги до 12 000 000 рублей.");

        while (storage3 <= 12_000_000) {
            storage3 += storage3 * 0.07;
            monthToGoal3++;

            if (monthToGoal3 % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", monthToGoal3, storage3);
            }
        }

        //Задача 6
        double storage4 = 15_000;

        System.out.println("\n\nКопим деньги 9 лет.");

        for (int i = 1; i <= 9 * 12; i++) {
            storage4 += storage4 * 0.07;

            if (i % 6 == 0) {
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n", i, storage4);
            }
        }

        //Задача 7
        Random random = new Random();
        int friday = random.nextInt(1, 8);

        System.out.println("\n\nПишем отчеты.");

        do {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", friday);
            friday += 7;
        } while (friday <= 31);

        //Задача 8
        short currentYear = 2024;
        short start = (short) (currentYear - 200);
        short end = (short) (currentYear + 100);

        System.out.print("\n\n");

        for (int i = start; i < end; i++) {
            if (i % 79 == 0) {
                System.out.print(i + "\n");
            }
        }

    }
}