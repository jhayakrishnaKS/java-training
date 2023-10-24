package D_overrideAndInheritance;

public class D_inheritance {
    public static void main(String[] args) {
        //inheritance
        Color lol=new Color();
        Brand lo=new Brand();
        lol.wheels();
        lol.col();
        lo.bran();

        System.out.println("  ");

        //overriding
        Color ja=new Brand();
        Brand jaa=new Brand();
        ja.wheels();
        ja.col();
        jaa.bran();

    }
}
