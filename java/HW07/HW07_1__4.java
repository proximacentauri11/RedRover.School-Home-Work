public class HW07_1__4 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int arraySum = 0;

        for (int i : array) {
            arraySum += i;
        }

        int result = arraySum / array.length;

        System.out.println(result); // среднее арифметическое всех значений массива
    }
}
