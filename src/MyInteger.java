public class MyInteger {
    /**
     * Задание №9: Класс MyInteger
     * Создайте класс с именем MyInteger, который должен содержать:
     *
     * Поле данных value типа int, в котором хранится целочисленное значение, представленное этим объектом.
     * Конструктор, который создает объект типа MyInteger для указанного значения типа int.
     * Getter-метод, который возвращает значение типа int.
     * Методы isEven(), isOdd() и isPrime(), которые возвращают значение true, если значение типа int в этом объекте является четным, нечетным или простым соответственно.
     * Статические методы isEven(int), isOdd(int) и isPrime(int), которые возвращают значение true, если указанное значение является четным, нечетным или простым соответственно.
     * Статические методы isEven(MyInteger), isOdd(MyInteger) и isPrime(MyInteger), которые возвращают значение true, если указанное значение является четным, нечетным или простым соответственно.
     * Методы equals(int) и equals(MyInteger), которые возвращают значение true, если значение типа int в этом объекте равняется указанному значению.
     * Статический метод parseInt(char[]), который преобразует массив числовых символов в значение типа int.
     * Статический метод parseInt(String), который преобразует строку в значение типа int.
     * Нарисуйте UML-диаграмму класса MyInteger, а затем реализуйте этот класс. Напишите клиент этого класса — программу, которая проверяет все методы этого класса.
     */

    public int value;

    public MyInteger(int value){
        this.value = value;
    }

    public boolean equals(int value) {
        return this.value == value;
    }

    public boolean equals(MyInteger value) {
        return value.value == this.value;
    }

    public static int parseInt(char[] value) {
        StringBuilder temp = new StringBuilder();
        for (char val: value) {
            temp.append(val);
        }
        return Integer.parseInt(temp.toString());
    }

    public static int parseInt(String value){
        return Integer.parseInt(value);
    }

    public int getValue() {
        return value;
    }

    public boolean isEven() {
        return this.value % 2 == 0;
    }

    public boolean isOdd() {
        return this.value % 2 != 0;
    }

    public boolean isPrime() {
        for (int i = 2; i <= this.value / 2; ++i) {
            if (this.value % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    public static boolean isOdd(int value) {
        return value % 2 != 0;
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i <= value / 2; ++i) {
            if (value % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static boolean isEven(MyInteger value) {
        return value.value % 2 == 0;
    }

    public static boolean isOdd(MyInteger value) {
        return value.value % 2 != 0;
    }

    public static boolean isPrime(MyInteger value) {
        for (int i = 2; i <= value.value / 2; ++i) {
            if (value.value % i == 0) {
                return true;
            }
        }
        return false;
    }
}
