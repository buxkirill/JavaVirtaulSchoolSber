import java.util.Scanner;

public class Project {
    static final double USD_RUB_rate = 72.12;

    /**
     * Отображает инструкцию
     */
    public static void instruct() {
        System.out.println("Эта программа конвертирует сумму денег из амеркианских долларов в российские рубли");
        System.out.println("Курс покупки равен " + USD_RUB_rate + " рубля.\n");

    }

    /**
     * Конвертирует n сумм денег из амеркианских долларов в российские рубли
     */
    public static double[] findRoubles(int[] dollarsArray, int numConvertation) {
        double[] roublesArray = new double[numConvertation];

        for (int i = 0; i < numConvertation; i++) {
            roublesArray[i] = USD_RUB_rate * dollarsArray[i];
        }

        return roublesArray;
    }

    public static void main(String[] args) {

        int[] dollarsArray;
        double[] roublesArray;
        int numConvertation;

        Scanner input = new Scanner(System.in);
        instruct();

        do {
            System.out.print("Введите количество конвертаций: ");
            numConvertation = input.nextInt();
        }
        while (numConvertation < 0);

        // Получить n сумм денег в USD
        System.out.print("Введите " + numConvertation + " сумм денег в американских долларах через пробел: ");
        dollarsArray = new int[numConvertation];
        for (int i = 0; i < numConvertation; i++) {
            dollarsArray[i] = input.nextInt();
        }

        // Конвертировать n сумм дегнег в RUB
        roublesArray = findRoubles(dollarsArray, numConvertation);

        // Отобразить
        System.out.println("\n\tСумма Р \tСумма $");
        for (int i = 0; i < numConvertation; i++) {
            System.out.println("\t" + dollarsArray[i] + "\t\t\t" + (int)(roublesArray[i] * 100) / 100.0 );
        }

    }
}