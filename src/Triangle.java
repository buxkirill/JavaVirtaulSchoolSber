public class Triangle extends GeometricObject{

    /**
     * Задание №22: Класс Triangle
     * Создайте класс Triangle для представления треугольников, который порождается от класса GeometricObject.
     * Класс Triangle должен содержать:
     *
     * Три поля данных типа double с именами side1, side2 и side3 и с заданными по умолчанию значениями,
     * равными 1.0, для обозначения трех сторон треугольника.
     * Безаргументный конструктор, который создает треугольник с заданными по умолчанию значениями.
     * Конструктор, который создает треугольник с side1, side2 и side3.
     * Getter-методы для всех трех полей данных.
     * Метод с именем getArea(), который возвращает площадь этого треугольника.
     * Метод с именем getPerimeter(), который возвращает периметр этого треугольника.
     * Метод с именем toString(), который возвращает строковое описание треугольника.
     * Формулы для вычисления площади треугольника:
     *
     * ,
     *
     * ,
     *
     * где s — полупериметр, а area — площадь треугольника.
     *
     * Метод toString() должен быть реализован следующим образом:
     *
     * return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
     *   " сторона3 = " + side3;
     * Нарисуйте UML-диаграммы классов Triangle и GeometricObject ,
     * а затем реализуйте эти классы.
     * Напишите клиент этих классов — программу,
     * которая запрашивает у пользователя ввести три стороны треугольника,
     * цвет и логическое значение для указания закрашен ли треугольник.
     * Программа должна создавать объект типа Triangle с указанными сторонами
     * и присваивать значения свойствам цвет (color) и заливка (isFilled) с помощью этих входных данных.
     * Программа должна отображать площадь (area), периметр (perimeter), цвет, а также true или false для указания,
     * закрашен треугольник или нет.
     */
    public double side1 = 1.0;
    public double side2 = 1.0;
    public double side3 = 1.0;

    public Triangle() {
        this.side1 = 1;
        this.side2 = 1;
        this.side3 = 1;
    }

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public Triangle(String color, boolean filled, double side1, double side2, double side3) {
        super(color, filled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getArea() {
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - this.side1) * (p - this.side2) * (p - this.side3));
    }

    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }

    public String toString() {
        return "Треугольник: сторона1 = " + side1 + " сторона2 = " + side2 +
                " сторона3 = " + side3;
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }
}
