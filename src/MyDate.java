import java.util.GregorianCalendar;

public class MyDate {
    /**
     * Задание №10: Класс MyDate
     * Создайте класс с именем MyDate для представления даты. Класс MyDate должен содержать:
     *
     * Поля данных year, month и day, которые представляют дату. Поле month должно быть основано на числе, т.е. 0 — для января, 1 — для февраля и т.д.
     * Безаргументный конструктор, который создает объект типа MyDate для текущей даты.
     * Конструктор, который создает объект типа MyDate с указанным временем в миллисекундах, прошедших с 00:00, 1 января 1970 г.
     * Конструктор, который создает объект типа MyDate с указанными годом, месяцем и днем.
     * Три getter-метода для полей данных year, month и day, соответственно.
     * Метод с именем setDate(long elapsedTime), который присваивает новую дату объекту, используя прошедшее время.
     * Нарисуйте UML-диаграмму класса MyDate, а затем реализуйте этот класс. Напишите клиент этого класса — программу,
     * которая создает два объекта типа MyDate (с помощью new MyDate() и new MyDate(34355555133101L)) и отображает их год, месяц и день.
     *
     * (Подсказка: первые два конструктора извлекут год, месяц и день из прошедшего времени.
     * Например, если прошедшее время составляет 561555550000 миллисекунд, то год равен 1987, месяц равен 9, а день равен 18.
     * Для упрощения кодирования можно использовать класс GregorianCalendar, описанный в подразделе «Задания. Часть 2» этого курса.)
     */

    public int year;
    public int month;
    public int day;

    public MyDate() {
        GregorianCalendar cal = new GregorianCalendar();
        this.year = cal.get(GregorianCalendar.YEAR);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = cal.get(GregorianCalendar.MONTH);
    }

    public MyDate(long milliseconds) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(milliseconds);
        this.year = cal.get(GregorianCalendar.YEAR);
        this.day = cal.get(GregorianCalendar.DAY_OF_MONTH);
        this.month = cal.get(GregorianCalendar.MONTH);
    }

    public MyDate(int year, int month, int day) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTimeInMillis(elapsedTime);
        this.year = cal.YEAR;
        this.day = cal.DAY_OF_MONTH;
        this.month = cal.MONTH;
    }

    public String print() {
        return this.year + "." + this.month + "." + this.day;
    }

}
