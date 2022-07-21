package com.qa.ims.persistence.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Order {
	 private Long id;
	    private Long customer_id;
	    private String date;
	    private List <Item>orderItems = new ArrayList<>();
	    
	    public Order(Long id, Long customer_id, String date, List<Item> orderItems) {
	        super();
	        this.id = id;
	        this.customer_id = customer_id;
	        this.date = date;
	        this.orderItems = orderItems;
	    }
	    
	    public Order(Long customer_id, String date) {
	        super();
	        this.customer_id = customer_id;
	        this.date = date;
	    }

	 

	    public Long getId() {
	        return id;
	    }

	 

	    public void setId(Long id) {
	        this.id = id;
	    }

	 

	    public Long getCustomer_id() {
	        return customer_id;
	    }

	 

	    public void setCustomer_id(Long customer_id) {
	        this.customer_id = customer_id;
	    }

	 

	    public String getDate() {
	        return date;
	    }

	 

	    public void setDate(String date) {
	        this.date = date;
	    }

	 

	    public List<Item> getOrderItems() {
	        return orderItems;
	    }

	 

	    public void setOrderItems(List<Item> orderItems) {
	        this.orderItems = orderItems;
	    }

	 

	    @Override
	    public int hashCode() {
	        return Objects.hash(customer_id, date, id, orderItems);
	    }

	 

	    @Override
	    public boolean equals(Object obj) {
	        if (this == obj)
	            return true;
	        if (obj == null)
	            return false;
	        if (getClass() != obj.getClass())
	            return false;
	        Order other = (Order) obj;
	        return Objects.equals(customer_id, other.customer_id) && Objects.equals(date, other.date)
	                && Objects.equals(id, other.id) && Objects.equals(orderItems, other.orderItems);
	    }

	 

	    @Override
	    public String toString() {
	        return "Order [id=" + id + ", customer_id=" + customer_id + ", date=" + date + ", orderItems=" + orderItems
	                + "]";
	    }
	    
	    
	    


}
