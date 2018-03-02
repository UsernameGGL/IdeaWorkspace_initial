package celue;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class Dabazhe implements CelueI{
    private float zhe;
    Dabazhe(float z){
        zhe=z;
    }
    Dabazhe(){}
    @Override
    public void celue() {
        System.out.println("打"+zhe+"折，请输入");
        Scanner input=new Scanner(System.in);
        double price=input.nextDouble();
        price*=zhe;
        System.out.println("打折后为"+price+"元");
    }
}
