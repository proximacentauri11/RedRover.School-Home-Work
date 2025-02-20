public class HW07_2__1 {
    public static void main(String[] args) {
        String first = "";
        for (int i = 0; i < 10; i++) {
            first = first + i + " ";
        }
        first = first.substring(0, first.length() - 1);
        System.out.println(first);

        for (int i = 2; i < first.length(); i = i + 2) {
            System.out.println(first.substring(0, first.length() - i));
        }
    }
}
