package com.ryh.bean;

public class Student {

	private int id;
	private String name;
	private String avatar_url;
	private int age;
	private float credit;

	
	public Student() { super(); }


	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAvatar_url() {
		return this.avatar_url;
	}

	public void setAvatar_url(String avatar_url) {
		this.avatar_url = avatar_url;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getCredit() {
		return this.credit;
	}

	public void setCredit(float credit) {
		this.credit = credit;
	}

	public String toString() {
		return "student[name:" + name + " age:" + age + " credit:" + credit;
	}

}
