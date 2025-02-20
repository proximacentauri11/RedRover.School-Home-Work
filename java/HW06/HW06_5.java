import java.util.Arrays;

public class HW06_5 {
    public static void main(String[] args) {
        int massSize = 10; // Размер массива должен быть равным по вертикали и горизонтали, поэтому одна переменная
        int[][] mass = new int[massSize][massSize]; // Создаем массив, который будем преобразовывать
        int startMass = 1; // Начинаем массив с единички

        for (int j = 0; j < mass.length; j++) {
            for (int h = 0; h < mass[j].length; h++) {
                mass[j][h] = startMass;
                startMass++;
            }
        }
        System.out.println("Созданный массив:");

        for (int p = 0; p < mass.length; p++) {
            System.out.println(Arrays.toString(mass[p]));
        }

        int[][] result = new int[massSize][massSize];

        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                result[i][j] = mass[j][i];
            }
        }

        System.out.println("Преобразованный массив:");

        for (int k = 0; k < result.length; k++) {
            System.out.println(Arrays.toString(result[k]));

        }
    }
}
