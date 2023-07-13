package com.sudip.HibernateProjectWork.Repository;


import java.util.List;

import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import com.sudip.HibernateProjectWork.entity.Person;

public class PersonRepository {
	private EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("sudip").createEntityManager();
	}
	public String savePerson(Person person) {
	//	EntityManagerFactory factory=Persistence.createEntityManagerFactory("sudip");
		
		//EntityManager manager=factory.createEntityManager();
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
	
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
		return "Data saved";
	}
	public String updatePerson(Person person) {
		EntityManager manager=getEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.persist(person);
		transaction.commit();
		
		return "Data updated";
	
	}
	public Person getPersonById(int id) {
		EntityManager manager = getEntityManager();
		return manager.find(Person.class,id);	
	}
	public String deletePerson(int id) {
		EntityManager manager=getEntityManager();
		Person person= manager.find(Person.class, id);
		if(person!=null) {
		EntityTransaction transaction = manager.getTransaction();
		transaction.begin();
		manager.remove(person);
		transaction.commit();
		
		return "Data data deleted";
	
		}else {
			return "no data found to delete";
		}
	}
	
	public List getAllData() {
		EntityManager manager=getEntityManager();
	Query query=manager.createQuery("From Person p");
	
	List list= query.getResultList();
	return list;
	
	}
	
	public  void getPhoneNumberByName(String name) {
		EntityManager manager= getEntityManager();
		String sql="SELECT p.phoneNumber FROM Person p WHERE p.name=1?";
		Query query=manager.createQuery("sql");
		
		query.setParameter(1,name);
		List list= query.getResultList();
		return ;
	}
	
	public List personDataByPersonNameAndAge(String name,int age) {
return null;			
	}

}
