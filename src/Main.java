import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] accountBook = generateRandomArray();

        System.out.println("Исходный массив: " + Arrays.toString(accountBook));

        System.out.println("Task 1");
        System.out.println("Сумма трат за месяц составила " + sumAllElements(accountBook) + " рублей");


        System.out.println("Task 2");
        System.out.println("Минимальная сумма трат за день составила " + minElement(accountBook) + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + maxElement(accountBook) + " рублей");

        System.out.println("Task 3");
        System.out.println("Средняя сумма трат за месяц составила " + averageSum(accountBook) + " рублей");

        System.out.println("Task 4");
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        System.out.println(reverseShow(reverseFullName));

        System.out.println("Task 5");
        matrix();

        System.out.println("Task 6");
        int[] array = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(reverseArrayWithAddArray(array)));

        System.out.println("Task 7");
        int[] array2 = {8, 7, 5, 4, 3, 2, 1, 4, 6};
        System.out.println(Arrays.toString(array2));
        System.out.println(Arrays.toString(reverseArrayWithoutAddArray(array2)));

        System.out.println("Task 8");
        int[] array3 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(array3));
        System.out.println(Arrays.toString(findPairNums(array3)));


        System.out.println("Task 9");
        int[] array4 = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        System.out.println(Arrays.toString(array4));
        System.out.println(findAllPairsNums(array4));


    }

    private static int sumAllElements(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum;
    }

    private static int minElement(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (min > element) {
                min = element;
            }
        }
        return min;
    }

    private static int maxElement(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (max < element) {
                max = element;
            }
        }
        return max;
    }

    private static double averageSum(int[] array) {
        return (double) sumAllElements(array) / array.length;
    }

    private static String reverseShow(char[] array) {
        StringBuilder answer = new StringBuilder();
        for (int i = array.length-1; i >= 0 ; i--) {
            answer.append(array[i]);
        }
        return answer.toString();
    }

    private static void matrix() {
        int[][] arr = new int[3][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == i || j == i - arr[i].length - 1 ||  j == arr[i].length - 1 - i) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = 0;
                }
            }
        }

        for (int[] row : arr) {
            for (int column : row) {
                System.out.print(column);
            }
            System.out.print("\n");
        }
    }

    private static int[] reverseArrayWithAddArray(int[] array) {
        int[] addArray = new int[array.length];

        for (int i = array.length-1; i >= 0; i--) {
            addArray[array.length-1 - i] = array[i];
        }
        return addArray;
    }

    private static int[] reverseArrayWithoutAddArray(int[] array) {
        for (int temp, i = 0; i <= (array.length-1) / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        return array;
    }

    private static int[] findPairNums(int[] array) {
        int[] answer = new int[2];

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == -2) {
                    answer[0] = array[i];
                    answer[1] = array[j];
                }
            }
        }
        return answer;
    }

    private static String findAllPairsNums(int[] array) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] + array[j] == -2) {
                    answer.append(array[i]);
                    answer.append(" & ");
                    answer.append(array[j]);
                    answer.append("; ");
                }
            }
        }
        return answer.toString();
    }

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}