package com.qa.ims.controllers;
import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import com.qa.ims.controller.ItemController;
import com.qa.ims.persistence.dao.ItemDAO;
import com.qa.ims.persistence.domain.Item;
import com.qa.ims.utils.Utils;

@RunWith(MockitoJUnitRunner.class)
public class ItemControllerTest {

	@Mock
	private Utils utils;

	@Mock
	private ItemDAO DAO;

	@InjectMocks
	private ItemController controller;

	@Test
	public void testCreate() {
		final String itemName = "cardigan";
		final double price = (double)80.99;
		final Item item = new Item(itemName, price);

		Mockito.when(utils.getString()).thenReturn(itemName);
		Mockito.when(utils.getDouble()).thenReturn(price);
		Mockito.when(DAO.create(item)).thenReturn(item);

		assertEquals(item, controller.create());

		Mockito.verify(utils, Mockito.times(1)).getString();
		Mockito.verify(utils, Mockito.times(1)).getDouble();
		Mockito.verify(DAO, Mockito.times(1)).create(item);

	}
	
	@Test
	public void testReadAll() {
		List<Item> item = new ArrayList<>();
		item.add(new Item(1L, "Apple TV", (double) 699.99));

		Mockito.when(DAO.readAll()).thenReturn(item);

		assertEquals(item, controller.readAll());

		Mockito.verify(DAO, Mockito.times(1)).readAll();
	}

	@Test
	public void testUpdate() {
		Item item = new Item(1L, "Apple MacbookPro", (double)1299.99);

		Mockito.when(this.utils.getLong()).thenReturn(1L);
		Mockito.when(this.utils.getString()).thenReturn(item.getName());
		Mockito.when(this.utils.getDouble()).thenReturn(item.getPrice());
		Mockito.when(this.DAO.update(item)).thenReturn(item);

		assertEquals(item, this.controller.update());

		Mockito.verify(this.utils, Mockito.times(1)).getLong();
		Mockito.verify(this.utils, Mockito.times(1)).getString();
		Mockito.verify(this.utils, Mockito.times(1)).getDouble();
		Mockito.verify(this.DAO, Mockito.times(1)).update(item);
	}

	@Test
	public void testDelete() {
		final long Id = 1L;

		Mockito.when(utils.getLong()).thenReturn(Id);
		Mockito.when(DAO.delete(Id)).thenReturn(1);

		assertEquals(1L, this.controller.delete());

		Mockito.verify(utils, Mockito.times(1)).getLong();
		Mockito.verify(DAO, Mockito.times(1)).delete(Id);
	}


}
