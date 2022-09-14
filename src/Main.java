public class Main {
    public static void main(String[] args) {
        // Задача 1
        System.out.println("Задача 1");
        int[] payments = new int[30];
        payments[0] = 100800;
        payments[1] = 102500;
        payments[2] = 104300;
        payments[3] = 100300;
        payments[4] = 108750;
        payments[5] = 110100;
        payments[6] = 180900;
        payments[7] = 195900;
        payments[8] = 105400;
        payments[9] = 112650;
        payments[10] = 133800;
        payments[11] = 140800;
        payments[12] = 154650;
        payments[13] = 167900;
        payments[14] = 123450;
        payments[15] = 199200;
        payments[16] = 144400;
        payments[17] = 150000;
        payments[18] = 157800;
        payments[19] = 194450;
        payments[20] = 188990;
        payments[21] = 121435;
        payments[22] = 165783;
        payments[23] = 178345;
        payments[24] = 124648;
        payments[25] = 189323;
        payments[26] = 154721;
        payments[27] = 167666;
        payments[28] = 187432;
        payments[29] = 123456;

        int sum = 0;

        for (int payment : payments) {
            sum += payment;
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей.");

        // Задание 2
        System.out.println("Задание 2");
        int maxPayments = -1;
        int minPayments = 1_000_000;

        for (int i = 0; i < payments.length; i++) {
            if (payments[i] < minPayments) {
                minPayments = payments[i];
            }
        }
        for (int i = 0; i < payments.length; i++) {
            if (payments[i] > maxPayments) {
                maxPayments = payments[i];
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayments + " рублей. Максимальная сумма трат за день составила " + maxPayments + " рублей.");

        // Задание 3
        System.out.println("Задание 3");
        float midlPayments = 0f;
        for (int a : payments) {
            midlPayments += a;
        }
        System.out.println("Средняя сумма трат за месяц составила " + midlPayments / payments.length + " рублей");

        // Задание 4
        System.out.println("Задание 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length-1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}