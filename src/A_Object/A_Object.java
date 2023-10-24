package A_Object;

class A_Object {
    String nam = "jkay";


    public static void main(String[] args) {
        A_Object jk = new A_Object();
        A_Object object = new A_Object(); //Accessing the class
        System.out.println(object.nam); //printing the nam in class A_object
        A_Object object1 = new A_Object();
        System.out.println(object1);// printing the address of the object1

        protected_1 signature=new protected_1();
        System.out.println(signature.name);

        private_1 kk = new private_1();
        System.out.println(kk.n);//printing the n in private class


    }

    static class private_1 {
        private int n = 10;
    }
static class protected_1{
        protected String name="aa";
}
}
