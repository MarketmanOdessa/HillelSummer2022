package HW2;



import java.util.stream.IntStream;

public class ArithmeticMeanOfNumbers {
    public static void main(String[] args)  {
        int[] arr = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            arr[i] = Integer.parseInt(args[i]);
        }
        int x = ArithmeticMean(arr);
        System.out.println(x);
    }
    public static int ArithmeticMean(int...array) {
        int sum = IntStream.of(array).sum();
        return sum/array.length;
    }


}
