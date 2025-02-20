public class HW07_1__1_2_3 {
    public static void main(String[] args) {
        int[] array = {9, 2, 6, 4, 5, 12, 7, 8, 6};

        int countSum = 0;
        for (int i : array) {
            countSum += i;
        }
        System.out.println(countSum); // сумма всех значений массива


        int max = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max); // максимальное значение массива

        int min = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < min) {
                min = i;
            }
        }
        System.out.println(min); // минимальное значение массива
    }
}
