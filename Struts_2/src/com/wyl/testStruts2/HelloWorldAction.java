package com.wyl.testStruts2;

import com.opensymphony.xwork2.ActionSupport;

public class HelloWorldAction extends ActionSupport {

	@Override
	public String execute() throws Exception {
		
		System.out.println("ִ��Action��ʼ��");
		return SUCCESS;
	}

	
}
