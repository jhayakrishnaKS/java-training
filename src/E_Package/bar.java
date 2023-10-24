package E_Package;

import E_Package.I.BarCode;

public class bar implements BarCode {
    public void stop(){
        System.out.println("yes stop");
    }
    void BarCode(int a){
        if(a==0){
            System.out.println("scan");
        }else{
            System.out.println("Don't scan");
        }
    }
}
