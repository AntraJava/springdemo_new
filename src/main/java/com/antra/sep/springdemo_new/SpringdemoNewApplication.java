package com.antra.sep.springdemo_new;

import com.antra.sep.springdemo_new.dao.DemoDAO;
import com.antra.sep.springdemo_new.dao.DemoDAOImpl;
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
    DemoService service;

    public static void main(String[] args) {
        SpringApplication.run(SpringdemoNewApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        service.doSomeThing();
//        DemoDAO demoDao = ac.getBean(DemoDAO.class);
//        DemoDAO demoDao2 = ac.getBean(DemoDAO.class);
//        System.out.println(demoDao == dao1);
//        System.out.println(demoDao2 == dao1);
    }
}
