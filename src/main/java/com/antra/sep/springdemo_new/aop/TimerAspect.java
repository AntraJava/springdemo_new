package com.antra.sep.springdemo_new.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Aspect
@Component
public class TimerAspect {

    @Around("@annotation(Timer)")
    public Object timeThisMethod(ProceedingJoinPoint pjp) {
        Object value = null;
        long current = System.nanoTime();
        try {
            value = pjp.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        long timeUsed = System.nanoTime() - current;
        System.out.println("Time Used: " + timeUsed);
        return value;
    }
}
