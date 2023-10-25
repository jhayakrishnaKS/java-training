package Tasks;
public class PairSum {
    public static void main(String[] args) {
        int k = 15;
        int arr[] = {-5, 1, -40, 20, 6, 8, 7};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k) {
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
}
