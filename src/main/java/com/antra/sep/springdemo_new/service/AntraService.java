package com.antra.sep.springdemo_new.service;

import com.antra.sep.springdemo_new.aop.Cache;
import com.antra.sep.springdemo_new.aop.Timer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

import java.util.Random;


@Service
public class AntraService {
//  1 1 2 3 5 8
    @Timer
    @Cache
    public int fibo(int i) {
        return i < 2 ? 1 : fibo(i-1) + fibo(i-2);
    }

    @Timer
    @Cache
    public int getSomeNumber(int x){
        return new Random().nextInt();
    }
}
