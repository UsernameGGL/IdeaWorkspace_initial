package AOP;

import celue.CelueI;
import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;

@Service
public class ManBefore implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        for(int j=0;j<objects.length;j++){
            Integer i=(Integer) objects[j];
            System.out.println(i);
            if(i<30){
                System.out.println("要是减的比30少，就升为减30");
                i=30;
                objects[j]=(Object)i;
            }
        }
    }
}
