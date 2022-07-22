package com.qa.ims.controller;

import java.util.List;



import org.apache.logging.log4j.LogManager;

 

import org.apache.logging.log4j.Logger;

 

import com.qa.ims.persistence.dao.OrderDAO;

 

import com.qa.ims.persistence.domain.Order;

 

import com.qa.ims.utils.Utils;

public class OrderController implements CrudController<Order> {
	
	public static final Logger LOGGER = LogManager.getLogger();

	 

    private OrderDAO OrderDAO;

 

    private Utils utils;

 

    public OrderController(com.qa.ims.persistence.dao.OrderDAO orderDAO, Utils utils) {

 

        super();

 

        OrderDAO = orderDAO;

 

        this.utils = utils;

 

    }

 

    @Override

 

    public List<Order> readAll() {

 

        List<Order> orders = OrderDAO.readAll();

 

        for (Order order : orders) {

 

            LOGGER.info(order);

 

        }

 

        return orders;

 

    }

 

    @Override

 

    public Order create() {

 

        LOGGER.info("Please Enter a customer ID");

 

        Long customerId = utils.getLong();

 

        LOGGER.info("Enter an order date, of format:yyyy/MM/dd");

 

        String dateOrdered = utils.getString();

 

        Order order = OrderDAO.create(new Order(customerId, dateOrdered));

 

        LOGGER.info("Order created");

 

        return null;

 

    }

 

    @Override

 

    public Order update() {

 

        LOGGER.info("Please enter an Order ID");

 

        Long OrderId = utils.getLong();

 

        LOGGER.info("Would you like to add to, or remove an item from an order?");

 

        String addOrDelete = utils.getString();

 

        if (addOrDelete.equals("add")) {

 

            LOGGER.info("Please enter the id of the item you wish to add to the order");

 

            Long itemId = utils.getLong();

 

            Order order = OrderDAO.addToOrder(OrderId, itemId);

 

            LOGGER.info("Order Updated");

 

            return order;

 

        } else if (addOrDelete.equals("remove")) {

 

            LOGGER.info("Please enter the id of the item you wish to remove from the order");

 

            Long itemId = utils.getLong();

 

            Order orders = OrderDAO.deleteFromOrder(OrderId, itemId);

 

            LOGGER.info("Order updated");

 

            return orders;

 

        } else {

 

            System.out.println("Please type either 'add' or 'remove'");

 

        }

 

        return OrderDAO.read(OrderId);

 

    }

 

    @Override

 

public int delete() {

 

 LOGGER.info("Please enter the id of the order you would like to delete");

 

Long id = utils.getLong();

 

return OrderDAO.delete(id);

 

 

 

}

	
	
	
	
}
