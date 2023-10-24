package D_overrideAndInheritance;

public class Car {
    public Car(){
        System.out.println("constructor works");
    }
    public Car(int a){
        System.out.println("constructor work"+a);
    }


    void wheels(){
        int wheels=4;
        System.out.println("total wheels in a car "+wheels);
    }

}
