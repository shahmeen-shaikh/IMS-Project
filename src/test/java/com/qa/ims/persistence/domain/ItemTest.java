package com.qa.ims.persistence.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.Assert;
import nl.jqno.equalsverifier.EqualsVerifier;

public class ItemTest {
	
	Item Item;
	Long id = (long) 1;
	String ItemName = "Sword";
	Double price = 500.00;
	
	
	@Test
	public void twoConstructor() {
		Item = new Item(ItemName, price);
	}


	@Test
	public void testgetname() {
		Item = new Item(id, ItemName, price);
		assertEquals(ItemName, Item.getName());
	}
	
	
	
	@Test
	public void testSetId() {
		Item = new Item(id, ItemName, price);
		Item.setId((long)6);
		assertEquals(6, Item.getId(), 6);
	}
	
	@Test
	public void testSetItemName() {
		Item = new Item(id, ItemName, price);
		Item.setName("Apple Charger");
		assertEquals("Apple Charger", Item.getName());
		
	}
	
	@Test
	public void testSetPrice() {
		Item = new Item(id, ItemName, price);
		Item.setPrice((double) 200);
		assertEquals(200, Item.getPrice(), 200);
	}
	

	

}
