package Tasks;

import java.util.Scanner;

public class VowelsDetection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String str1 = "";
        str1 = str.replaceAll("[aeiou]", "");
        System.out.println("String after removing vowel : " + str1);

    }
}
