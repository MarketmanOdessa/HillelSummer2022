package HW2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticMeanOf2Numbers {
    public static void main(String[] args) throws IOException {
        System.out.println("Введите первое число:");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int f = Integer.parseInt(reader.readLine());
        System.out.println("Введите второе число:");
        int s = Integer.parseInt(reader.readLine());
        int x = ArithmeticMean(f,s);
        System.out.println("Среднее арифметические значение двух чисел равно: " + x);
        }
        public static int ArithmeticMean(int a, int b) {
        return (a+b)/2;
    }
}
