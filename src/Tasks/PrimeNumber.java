package Tasks;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("All Prime Numbers Between 1 to 100");
        for (int i = 2; i <= 100; i++) {
            int flag = 0;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0)
                System.out.print(i + " ");
        }
    }

}
