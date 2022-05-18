
package com.example.manytooneDemo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
	
	@Id
	int item_id;
	String item_desc;
	int item_Cost;
	
	@ManyToOne
	@JoinColumn(name="cart_id")
	private Cart cartobj;

	public int getItem_id() {
		return item_id;
	}

	public void setItem_id(int item_id) {
		this.item_id = item_id;
	}

	public String getItem_desc() {
		return item_desc;
	}

	public void setItem_desc(String item_desc) {
		this.item_desc = item_desc;
	}

	public int getItem_Cost() {
		return item_Cost;
	}

	public void setItem_Cost(int item_Cost) {
		this.item_Cost = item_Cost;
	}

	public Cart getCartobj() {
		return cartobj;
	}

	public void setCartobj(Cart cartobj) {
		this.cartobj = cartobj;
	}

	public Items() {
		
	}
	public Items(int item_id, String item_desc, int item_Cost, Cart cartobj) {
		super();
		this.item_id = item_id;
		this.item_desc = item_desc;
		this.item_Cost = item_Cost;
		this.cartobj = cartobj;
	}

	public static void save(Items e1) {
		// TODO Auto-generated method stub
		
	}

	
	}

	
	
