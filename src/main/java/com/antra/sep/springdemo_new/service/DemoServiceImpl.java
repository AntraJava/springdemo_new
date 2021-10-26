package com.antra.sep.springdemo_new.service;

import com.antra.sep.springdemo_new.aop.Timer;
import com.antra.sep.springdemo_new.dao.DemoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("aService")
public class DemoServiceImpl implements DemoService{

	@Autowired
	DemoDAO aDAO;

	@Autowired(required = false)
	List<String> companyList;

	@Override
	@Timer
	public void doSomeThing() {
		//begin tx
		//s1
		aDAO.doSomething();
		//s3
		// catch roll  back tx
		//commit tx
	}

	public void doSomething2() {
		//begin tx
		//s1
		//s2
		//s3
		//catch roll back tx
		//commit tx
	}
}
