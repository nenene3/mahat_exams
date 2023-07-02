package magen;

public class ex8 {
    public static void main(String[] args) {
        bottle('*', 15);
    }

    public static void bottle(char tav, int n) {
        if (n % 2 == 0 && n < 0)
            return;

        int s = -1;
        for (int i = n; i >= 1; i -= 2) {
            s++;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++)
                System.out.print(tav);

            System.out.println();
        }

        for (int i = 0; i <= n-2; i += 2) {
            s--;
            for (int j = 0; j < s; j++) {
                System.out.print(" ");

            }
            for(int j=0;j<3+i;j++)
                System.out.print(tav);
            System.out.println();

        }
    }
}

