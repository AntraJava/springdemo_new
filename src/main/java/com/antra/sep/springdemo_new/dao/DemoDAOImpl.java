package com.antra.sep.springdemo_new.dao;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
@Repository // default name = demoDAOImpl
public class DemoDAOImpl implements DemoDAO {
	
	private String message = "123";
	
	public void doSomething(){
		System.out.println(message);
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public void saveDemo(String a, String b) {
		System.out.println("In save DEMO");
	}
	public void test1234() {
		System.out.println("Inside testmethod");
		//throw new RuntimeException();
	}
}
