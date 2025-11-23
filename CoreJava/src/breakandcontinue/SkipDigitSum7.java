package breakandcontinue;

public class SkipDigitSum7 {
    public static void main(String[] args) {

        for (int i = 100; i >= 1; i--) {
            int num = i;
            int digitSum = 0;

            // Calculate digit sum
            while (num > 0) {
                digitSum += num % 10;
                num /= 10;
            }

            // Skip if digit sum equals 7
            if (digitSum == 7) {
                continue;
            }

            System.out.println(i);
        }
    }
}

