
import java.util.Arrays;
import java.util.Random;
public class SPTV21Task4MilanPanov {
    public static void main(String[] args) {
            int[] numbers;
            int arifnum = 0, summa = 0;
            numbers = new int[100];
            Random random = new Random();
            int min = 1, max = 100;
            int i;
            for (i = 0; i < numbers.length; i++)
            {
                numbers[i] = random.nextInt(max - min + 1) - min;
                summa +=numbers[i];
                
            arifnum = summa/100;
            Arrays.sort(numbers);
            for (int q = 0; q < 10; q++) {
                for (int w = 0; w < 10; w++) {
                    System.out.print(numbers[q * 10 + w] + " ");
                }
                System.out.print("\n");
            }
            System.out.println("Среднее арифметическое - " + arifnum);
        }
    }
}