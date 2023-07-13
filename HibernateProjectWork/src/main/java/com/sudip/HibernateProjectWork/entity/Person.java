package com.sudip.HibernateProjectWork.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="person")
public class Person implements Serializable {
	@Id
	private Integer id;
	private String name;
	private String gender;
	private Integer  age;
	@Column(name="phoneno")
	private String phoneNo;
	private String phone_numb;
	
	
	public String getPhone_numb() {
		return phone_numb;
	}

	public void setPhone_numb(String phone_numb) {
		this.phone_numb = phone_numb;
	}


	public Person(Integer id, String name, String gender, Integer age, String phoneNo, String phone_numb) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phoneNo = phoneNo;
		this.phone_numb=phone_numb;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", gender=" + gender + ", age=" + age + ", phoneNo=" + phoneNo
				+ ", phone_numb=" + phone_numb + "]";
	}
	
	

}
