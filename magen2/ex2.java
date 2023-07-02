package magen2;

public class ex2 {
    public static void main(String[] args) {

        System.out.println(hasSameDigits(12345, 52314));
    }

    public static boolean hasSameDigits(int num1, int num2) {
        int[] numbers = new int[10];
        while (num1 != 0) {
            numbers[num1 % 10]++;
            num1 /= 10;
        }

        while (num2 != 0) {
            numbers[num2 % 10]--;
            num2 /= 10;
        }
        for (int i = 0; i < numbers.length; i++)
            if (numbers[i] != 0)
                return false;
        return true;
    }
}
