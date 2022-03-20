public class MyTime {

    /**
     * Создайте класс MyTime для представления времени. Класс MyTime должен содержать:
     *
     * Поля данных hour, minute и second, которые представляют время.
     * Безаргументный конструктор, который создает объект типа MyTime для текущего времени.
     * (Значения полей данных этого объекта представляют текущее время.)
     * Конструктор, который создает объект типа MyTime с указанным временем в миллисекундах, прошедших с 00:00, 1 января 1970 г.
     * (Значения полей данных этого объекта будут представлять это время.)
     * Конструктор, который создает объект типа MyTime с указанными часами, минутами и секундами.
     * Три getter-метода для полей данных hour, minute и second соответственно.
     * Метод с именем setTime(long elapseTime), который присваивает объекту новое время с помощью прошедшего время.
     * Например, если прошедшее время равно 555550000 миллисекундам, то hour равно 10, minute равно 19, а second равно 10.
     * Нарисуйте UML-диаграмму класса MyTime, а затем реализуйте этот класс.
     * Напишите клиент этого класса — программу, которая создает три объекта типа MyTime (с помощью new MyTime(), new MyTime(555550000) и new MyTime(5, 23, 55))
     * и отображает значениях их полей данных hour, minute и second в формате часы:минуты:секунды.
     *
     * (Подсказка: первые два конструктора извлекут значения hour, minute и second из прошедшего времени.
     * Для безаргументного конструктора текущее время может быть получено с помощью метода System.currentTimeMillis(),
     * как было показано в программе ShowCurrentTime из курса «Основы Java-программирования». Пусть время будет GMT.)
     */

    public int hour;
    public int minute;
    public int second;
    final int MILLISECONDS_PER_SECOND = 1000; // 1 секунда содержит 1000 миллисекунд
    final int SECONDS_PER_MINUTE = 60; // 1 минута содержит 60 секунд
    final int MINUTES_PER_HOUR = 60; // 1 час содержит 60 минут
    final int HOURS_PER_DAY = 24; // 1 сутки содержат 24 часа

    public MyTime(){
        long totalSeconds = System.currentTimeMillis() / MILLISECONDS_PER_SECOND;
        long currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        long totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        long currentMinute = totalMinutes % MINUTES_PER_HOUR;
        long totalHours = totalMinutes / MINUTES_PER_HOUR;
        long currentHour = totalHours % HOURS_PER_DAY;
        this.hour = (int)currentHour;
        this.minute = (int)currentMinute;
        this.second = (int)currentSecond;
    }

    public MyTime(long milliseconds) {
        long totalSeconds = milliseconds / MILLISECONDS_PER_SECOND;
        long currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        long totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        long currentMinute = totalMinutes % MINUTES_PER_HOUR;
        long totalHours = totalMinutes / MINUTES_PER_HOUR;
        long currentHour = totalHours % HOURS_PER_DAY;
        this.hour = (int)currentHour;
        this.minute = (int)currentMinute;
        this.second = (int)currentSecond;
    }

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setTime(long elapseTime) {
        long totalSeconds = elapseTime / MILLISECONDS_PER_SECOND;
        long currentSecond = totalSeconds % SECONDS_PER_MINUTE;
        long totalMinutes = totalSeconds / SECONDS_PER_MINUTE;
        long currentMinute = totalMinutes % MINUTES_PER_HOUR;
        long totalHours = totalMinutes / MINUTES_PER_HOUR;
        long currentHour = totalHours % HOURS_PER_DAY;
        this.hour = (int)currentHour;
        this.minute = (int)currentMinute;
        this.second = (int)currentSecond;
    }

    public String printTime() {
        return this.hour + ":" + this.minute + ":" + this.second;
    }
}
