package celue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Scanner;

public class Manjian implements CelueI ,CelueZ {

    int can;
    int man;
    int jian;
    Manjian(int m,int j){
        man=m;
        jian=j;
    }

    public void setCan(int can) {
        this.can = can;
    }

    public int getMan() {
        return man;
    }

    public int getJian() {
        return jian;
    }

    public void setMan(int man) {
        this.man = man;
    }

    public void setJian(int jian) {
        this.jian = jian;
    }

    @Override
    public void celue(){
        System.out.println("满"+man+"减"+jian+"，请输入");
        Scanner input = new Scanner(System.in);
        double price=input.nextDouble();
        price=price-jian*(int)(price/man);
        System.out.println("需要付款"+price+"元");
    }

    @Override
    public void celue(int m, int j) {
        System.out.println("满"+m+"减"+j+"，请输入");
        Scanner input = new Scanner(System.in);
        double price=input.nextDouble();
        price=price-j*(int)(price/m);
        System.out.println("需要付款"+price+"元");
    }

}
