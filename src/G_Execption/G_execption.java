package G_Execption;

public class G_execption {
    public static void main(String[] args) {
        try {
            new Test().add();

        }catch (Exception e){
            throw new RuntimeException(e);
        }

        try{
            int a=10/0;
            System.out.println("yay");
        }catch (Exception e){
            if(e instanceof ArithmeticException){
                System.out.println("Error");
            }else {
                System.out.println(e);
            }
        }
    }
} class Test{
    void add() throws Exception {
        throw new Exception("custom error");
    }
}
