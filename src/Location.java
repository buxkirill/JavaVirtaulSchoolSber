public class Location {

    /**
     * Задание №7: Класс Location
     * Создайте класс с именем Location для нахождения наибольшего элемента и его позиции в двумерном массиве.
     * Класс должен содержать public-поля row, column и maxValue,
     * в которых будут храниться наибольший элемент типа double и его индексы в двумерном массиве со строчками и столбцами типа int.
     *
     * Напишите следующий метод, который возвращает позицию наибольшего элемента в двумерном массиве:
     *
     * public static Location locateLargest(double[][] a)
     * Возвращаемое значение должно быть типа Location. Напишите клиент этого класса — программу,
     * которая предлагает пользователю ввести двумерный массив и отображает позицию наибольшего элемента в этом массиве.
     * Пример выполнения программы:
     *
     * Введите количество строчек и столбцов массива: 3 4
     * Введите массив:
     * 23.5 35 2 10
     * 4.5 3 45 3.5
     * 35 44 5.5 9.6
     * Наибольший элемент массива, равный 45.0, находится в позиции (1, 2)
     */

    public int row = 0;
    public int column = 0 ;
    public double maxValue = 0;


    public Location() {

    }

    public static Location locateLargest(double[][] a) {
        Location obj = new Location();
        for (int row = 0; row < a.length; row++) {
            for (int column = 0; column < a[0].length; column++) {
                if (a[row][column] > obj.maxValue) {
                    obj.row = row;
                    obj.maxValue = a[row][column];
                    obj.column = column;
                }
            }

        }
        return obj;
    }
}
