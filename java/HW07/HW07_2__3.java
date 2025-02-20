public class HW07_2__3 {
    public static void main(String[] args) {
        String first = "";
        String second = "";
        for (int i = 9; i >= 0; i--) {
            first = first + i + " ";
        }
        for (int i = 1; i < 10; i++) {
            second = second + i + " ";
        }
        first = first.substring(0, first.length() - 1);
        second = second.substring(0, second.length() - 1);

        String space = "";

        for (int i = 0; i < first.length(); i = i + 2) {
            if (second.length() - i >= 0) {
            System.out.println(space + first.substring(i) + " " + second.substring(0, second.length() - i));
            space = space + "  ";
            } else {
                System.out.println(space + first.substring(i));
            }
        }

    }
}
