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
        task5();

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

    private static void task5() {
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

    public static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}