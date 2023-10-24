package G_Thread;
public class G_thread extends Thread{
    public void run(){
        System.out.println("running");
    }

    public static void main(String[] args) {
        G_thread gThread=new G_thread();
        gThread.start();
    }
}
