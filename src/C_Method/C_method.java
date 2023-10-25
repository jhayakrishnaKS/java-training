package C_Method;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C_method {
    void method() {
        System.out.println("enter the numbers to add");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    void method(String msg) {
        System.out.print(" here is the sum ");
    }
//    void exception(int a ,int b){
//        try{
//
//        }catch (InputMismatchException e){
//            System.out.println("enter in int");
//        }
//    }


    public static void main(String[] args) {
        C_method obj = new C_method();
        obj.method();

        Scanner sc = new Scanner(System.in);


        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = add(a, b);
        int sub = sub(a, b);
        obj.method("overloading");
        System.out.print(sum);
        obj.method(" sub");
        System.out.println(sub);

    }
}
