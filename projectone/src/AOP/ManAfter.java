package AOP;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.stereotype.Service;

import java.lang.reflect.Method;
import java.time.Clock;
import java.util.Date;

@Service
public class ManAfter implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("现在是"+(new Date()).toString());
    }
}
