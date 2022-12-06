package com.jsp.marker;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class MarkerDriver {
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("nihal");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Marker marker=new Marker();
		marker.setId(1);
		marker.setName("FlowMAx");
		marker.setBrand("Camlin");
		marker.setPrice(45.0);
		
		entityTransaction.begin();
		entityManager.persist(marker);
		entityTransaction.commit();
		System.out.println("all good");
	}

}
