package miu.edu.lab05;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
@Aspect
@Component
public class Helper {

    @Pointcut("@annotation(miu.edu.lab05.HelloWorld)")
    public void helloWorld() {}

//    @After("@annotation(miu.edu.lab05.HelloWorld)")
    @After("helloWorld()")
    public void print(JoinPoint joinPoint) {
        System.out.println("Hello world!");
    }
}
