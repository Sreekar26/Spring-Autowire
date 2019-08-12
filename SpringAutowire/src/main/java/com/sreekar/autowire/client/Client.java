package com.sreekar.autowire.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sreekar.autowire.Employee;
import com.sreekar.autowire.PanCard;

public class Client {
	
	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("empBean.xml");
		
		Employee employee = ctx.getBean("employee", Employee.class);
		if(employee != null){
			System.out.println(employee.getEmpId()+"\t"+employee.getEmpName()+"\t"+employee.getEmpDesignation());
			
			PanCard pancard = employee.getPanCard();
			if(pancard != null)
				System.out.println(pancard.getPanName()+"\t"+pancard.getPanNumber());
		}
		
		((AbstractApplicationContext) ctx).close();
	}

}
