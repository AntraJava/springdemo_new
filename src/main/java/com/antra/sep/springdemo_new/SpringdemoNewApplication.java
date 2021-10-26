package com.antra.sep.springdemo_new;

import com.antra.sep.springdemo_new.dao.DemoDAO;
import com.antra.sep.springdemo_new.dao.DemoDAOImpl;
import com.antra.sep.springdemo_new.service.AntraService;
import com.antra.sep.springdemo_new.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringdemoNewApplication implements CommandLineRunner {

//    @Autowired
//    ApplicationContext ac;
    @Autowired
    AntraService antraService;

    public static void main(String[] args) {
        SpringApplication.run(SpringdemoNewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println(antraService.getSomeNumber(1));
        System.out.println(antraService.getSomeNumber(2));
        System.out.println(antraService.getSomeNumber(3));
        System.out.println(antraService.getSomeNumber(2));

    }
}
