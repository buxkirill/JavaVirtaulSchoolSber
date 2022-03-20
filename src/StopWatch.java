import java.lang.reflect.Array;
import java.util.Arrays;

public class StopWatch {

    /**
     * Создайте класс с именем StopWatch для представления секундомера. Класс StopWatch должен содержать:
     *
     * Скрытые поля данных startTime и endTime с getter-методами.
     * Безаргументный конструктор, который инициализирует startTime с текущим временем.
     * Метод с именем start(), который сбрасывает startTime до текущего времени.
     * Метод с именем stop(), который присваивает endTime текущее время.
     * Метод с именем getElapsedTime(), который возвращает прошедшее время на секундомере в миллисекундах.
     * Нарисуйте UML-диаграмму класса StopWatch, а затем реализуйте этот класс. Напишите клиент этого класса – программу, которая вычисляет время выполнения сортировки 100 000 чисел методом выбора.
     */
    private Long startTime;
    private Long endTime;


    public StopWatch() {
        startTime = System.currentTimeMillis();
    }

    public void start() {
        startTime = System.currentTimeMillis();
    }

    public void stop() {
        endTime = System.currentTimeMillis();
    }

    public Long getElapsedTime() {
        return endTime - startTime;
    }

    public Long getStartTime() {
        return startTime;
    }

    public Long getEndTime() {
        return endTime;
    }

    public void setStartTime(Long newStartTime) {
        startTime = newStartTime;
    }

    public void setEndTime(Long newEndTime) {
        endTime = newEndTime;
    }

    public static void main(Long[] args) {



    }
}
