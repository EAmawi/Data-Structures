package Arrays;

public class DemoArrays {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 6, 2, 3, 7, 34, 25, 25, 6, 3, 2};

        for (int n : numbers) {
            System.out.print("" + n + " ");
        }
        System.out.println();
        insertionSort2(numbers);

        for (int n : numbers) {
            System.out.print("" + n + " ");
        }
        System.out.println();

    }

    public static void insertionSort(int[] numbers) {
        int length = numbers.length;
        for (int i = 1; i < length; i++) {

            for (int j = i; j > 0; j--) {
                if (numbers[j - 1] > numbers[j]) {
                    int temp = numbers[j - 1];
                    numbers[j - 1] = numbers[j];
                    numbers[j] = temp;
                }
            }

        }
    }

    public static void insertionSort2(int[] numbers) {
        int length = numbers.length;
        for (int i = 1; i < length; i++) {

            int cur = numbers[i];
            int j = i;
            while (j > 0 && numbers[j - 1] > cur) {
                numbers[j] = numbers[j - 1];
                j--;
            }

            numbers[j] = cur;
        }

    }

}
