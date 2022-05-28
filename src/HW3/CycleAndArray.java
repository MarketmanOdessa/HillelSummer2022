package HW3;

import java.util.Arrays;

public class CycleAndArray {
    public static void main(String[] args) {
        System.out.println("При помощи цикла for вывести на экран нечетные числа от 1 до 99.");
        OddNumbers1();
        System.out.println("Дано число n при помощи цикла for посчитать факториал n!");
        Factorial2(9);
        System.out.println("Перепишите программы (1 и 2) с использованием цикла while.");
        OddNumbers3();
        System.out.println("Перепишите программы (1 и 2) с использованием цикла while.");
        Factorial3(8);
        System.out.println("Перепишите программы (1 и 2) с использованием цикла do - while.");
        OddNumbers4();
        System.out.println("Перепишите программы (1 и 2) с использованием цикла do - while.");
        Factorial4(7);
        System.out.println("Даны переменные x и n вычислить x^n.");
        Exponentiation5(6, 5);
        System.out.println("Вывести 10 первых чисел последовательности 0, -5,-10,-15..");
        subsequence6();
        System.out.println("Необходимо вывести на экран таблицу умножения на Х (х любое число в диапазоне 0 .. 10)");
        MultiplicationTable7(4);
        System.out.println("Создайте массив, содержащий 10 первых нечетных чисел. Выведете элементы массива на консоль в одну строку, разделяя запятой.");
        Array8();
        System.out.println("Дан массив размерности N, найти наименьший элемент массива и вывести на консоль (массив заполнить случайными числами из диапазона 0 .. 100)\n" +
                "В массиве из задания 9. найти наибольший элемент");
        ArrayN9and10(3);
        System.out.println("Поменять наибольший и наименьший элементы массива местами. Пример: дан массив {4, -5, 0, 6, 8}. После замены будет выглядеть {4, 8, 0, 6, -5}.");
        ArrayChange11(new int[]{4, -5, 0, 6, 8});
        System.out.println("Вывести на экран шахматную доску 8х8 в виде 2 мерного массива (W - белые клетки , B - черные клети)");
        Chess12();
    }

    public static void OddNumbers1() {
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) System.out.print(" " + i);
        }
        System.out.println();
    }

    public static void Factorial2(int a) {
        int result = 1;
        for (int i = 1; i <= a; i++) {
            result = result * i;
        }
        System.out.println(result);
    }

    public static void OddNumbers3() {
        int i = 0;
        while (i < 100) {
            if (i % 2 != 0) System.out.print(" " + i);
            i++;
        }
        System.out.println();
    }

    public static void Factorial3(int a) {
        int result = 1;
        int i = 1;
        while (i <= a) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void OddNumbers4() {
        int i = 0;
        do {
            if (i % 2 != 0) System.out.print(" " + i);
            i++;
        }
        while (i < 100);
        System.out.println();
    }

    public static void Factorial4(int a) {
        int result = 1;
        int i = 1;
        do {
            result = result * i;
            i++;
        }
        while (i <= a);
        System.out.println(result);
    }

    public static void Exponentiation5(int x, int n) {
        System.out.println((int) Math.pow(x, n));
    }

    public static void subsequence6() {
        int j = 0;
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + j);
            j = j - 5;
        }
        System.out.println();
    }

    public static void MultiplicationTable7(int a) {
        for (int i = 1; i < 11; i++) {
            int b = a * i;
            System.out.print(" " + a + "*" + i + "=" + b);
        }
        System.out.println();
    }

    public static void Array8() {
        int j = 1;
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = j;
            j = j + 2;
            System.out.print(arr[i] + ", ");
        }
        System.out.println();
    }
    public static void ArrayN9and10(int N) {
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        int min = arr[0];
        for (int i = 0; i < N; i++) {
            min = Math.min(min, arr[i]);
        }
        System.out.println(min);

        int max = arr[0];
        for (int i = 0; i < N; i++) {
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
    public static void ArrayChange11(int[] arr) {
        int max = arr[0];
        int min = arr[0];
        int maxInd = 0;
        int minInd = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) {
                maxInd = i;
                max = arr[i];
            }
            if (min < arr[i]) {
                minInd = i;
                min = arr[i];
            }
        }
        int a = arr[minInd];
        arr[minInd] = arr[maxInd];
        arr[maxInd] = a;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void Chess12() {
        String [][] Board = new String[8][8];
        for (int i = 0; i< Board.length; i++) {
            for (int j = 0; j < Board[0].length; j++) {
                if ((i + j) % 2 == 0) {
                    Board[i][j] = "W";
                }
                else {
                    Board[i][j] = "B";
                }
            }
        }
        Arrays.stream(Board).map(Arrays::toString).forEach(System.out::println);
    }
}

