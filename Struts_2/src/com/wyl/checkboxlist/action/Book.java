package com.wyl.checkboxlist.action;

public class Book {

	private String name; //����
	private String author;//�������
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//�޲������캯��
	public Book(){}
	
	//�в����Ĺ��캯��
	public Book(String name,String author){
		this.name = name;
		this.author = author;
	}
	
}
