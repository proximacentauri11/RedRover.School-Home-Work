public class HW07_1__5_6_7 {
    public static void main(String[] args) {

        int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9}, {-1, -2, -3, -4}, {-5, -6}};

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                count += j;
            }
        }
        System.out.println(count); // сумма всех элементов массива

        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                if (j > max) {
                    max = j;
                }
            }
        }
        System.out.println(max); // максимальное значение массива

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                if (j < min) {
                    min = j;
                }
            }
        }
        System.out.println(min); // минимальное значение массива


    }
}
