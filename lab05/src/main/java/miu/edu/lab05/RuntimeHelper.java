package miu.edu.lab05;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class RuntimeHelper {

    @Pointcut("@annotation(miu.edu.lab05.ExecutionTime)")
    public void executor() {}

    @Around("executor()")
    public Object calculate(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object result = proceedingJoinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end - start + "ms");
        return result;
    }
}
