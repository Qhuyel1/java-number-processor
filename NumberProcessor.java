public class NumberProcessor {

    public static int processNumbers(int[] arr) {
        int sumPositive = 0;

        for (int num : arr) { // vòng lặp
            if (num > 0) { // rẽ nhánh
                sumPositive += num;
            }
        }

        return sumPositive;
    }

    public static String checkEvenOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}