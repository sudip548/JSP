package com.sudip.HibernateProjectWork.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class College  implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String pincode;
	
	
//	@OneToMany(cascade=CascadeType.All,mappedBy="college")
//	List<Dept>depts;
	
}
