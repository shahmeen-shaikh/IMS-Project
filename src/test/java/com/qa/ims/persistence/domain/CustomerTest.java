package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import nl.jqno.equalsverifier.EqualsVerifier;

public class CustomerTest {

	
	
	Customer customer;
	Long id = (long) 2;
	String firstName = "Garou";
	String surname = "Genos";
	

	@Test
	public void testToString() {
		customer = new Customer(id, firstName, surname);
		assertEquals(("id:" + customer.getId() + " first name:" + customer.getFirstName() + " surname:" + customer.getSurname()), customer.toString());
	}
	

	@Test
	public void firstConstructorTest() {
		Customer customer = new Customer("Garou", "Genos");
		assertEquals("Marcus", customer.getFirstName());
		assertEquals("Rashford", customer.getSurname());

	}

	
	
	
	@Test
	public void secondConstructorTest() {
		Customer customer = new Customer(1L, "laraib", "shaikh");
		assertEquals(Long.valueOf("1"), customer.getId());
		assertEquals("laraib", customer.getFirstName());
		assertEquals("shaikh", customer.getSurname());

	}

}
