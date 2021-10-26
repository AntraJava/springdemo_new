package com.antra.sep.springdemo_new.service;

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
	public void doSomeThing() {
		aDAO.doSomething();
	}

	
}
