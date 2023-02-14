public class helpers {

    public static String getNumber(int size) {

        if (size == 0) {
            return "Массив не задан";
        } else if (size == 1) {
            return " целое число";
        } else if (size < 5) {
            return " целых числа";
        } else {
            return " целых чисел";
        }
    }
}



