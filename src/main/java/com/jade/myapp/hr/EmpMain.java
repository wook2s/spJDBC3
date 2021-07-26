package com.jade.myapp.hr;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jade.myapp.hr.model.EmpVO;
import com.jade.myapp.hr.service.IEmpService;

public class EmpMain {

	public static void main(String[] args) {
		AbstractApplicationContext context = new GenericXmlApplicationContext("spring/application-config.xml");
		IEmpService empService = context.getBean(IEmpService.class);
		
		System.out.println(empService.getAllDeptId());
		System.out.println(empService.getAllJobId());
		System.out.println(empService.getAllManagertId());
	}
}
