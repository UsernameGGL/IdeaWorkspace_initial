package pakageone;

import celue.CelueZ;
import celue.Dabazhe;
import celue.Manjian;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String args[]){

        ApplicationContext context =
                new ClassPathXmlApplicationContext(
                        new String[]{"XMLOne.xml"}
                );
        CelueZ celueZ=context.getBean("celuedaili", CelueZ.class);
        celueZ.celue(100,20);
    }
}
