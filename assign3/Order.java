package com.epsilon.Project;

import java.util.List;

public class Order {
	
	int Orderid;
	Customer customer;
	List <Book> orderitems;
	public int getOrderid() {
		return Orderid;
	}
	public void setOrderid(int orderid) {
		Orderid = orderid;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Book> getOrderitems() {
		return orderitems;
	}
	public void setOrderitems(List<Book> orderitems) {
		this.orderitems = orderitems;
	}
	@Override
	public String toString() {
		return "Order [Orderid=" + Orderid + ", customer=" + customer + ", orderitems=" + orderitems + "]";
	}

	
	
	

}
