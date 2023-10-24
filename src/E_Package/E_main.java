package E_Package;

public class E_main {
    public static void main(String[] args) {
        int n=0;
        bar obj=new bar();
        obj.BarCode(n);
        if(n==1){
            System.out.println("null");
        }else{
            obj.stop();
        }
    }
}
