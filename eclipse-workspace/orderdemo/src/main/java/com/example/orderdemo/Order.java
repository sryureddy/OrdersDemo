package com.example.orderdemo
;







import jakarta.persistence.Entity;



import jakarta.persistence.Id;

import jakarta.persistence.Table;



import java.time.LocalDate;







@Entity

@Table(name = "orders")

public class Order {



	@Id



	private int Id;



	private String Name;



	private String foodItem;

	

	private int quantity;

	

	private double total;



	private LocalDate oDate;

	

	private String oStatus;



	



	



	public void setId(int Id) {



		this.Id = Id;



	}



	



	public void setName(String Name) {



		this.Name = Name;



	}



	



	public void setFood(String foodItem) {



		this.foodItem = foodItem ;



	}



	public void setQuantity(int quantity) {



		this.quantity = quantity;



	}

	public void setAmount(double total) {



		this.total = total;

	}



	



	public void setDate(LocalDate oDate) {



		this.oDate = oDate;



	}

	

	public void setOstatus(String oStatus) {

		this.oStatus = oStatus;

	}



	



	public int getId() {



		return Id;



	}



	



	public String getName() {



		return Name;



	}



	



	public String getFood() {



		return foodItem;



	}



	



	public int getQuantity() {



		return quantity;



	}



	public double getAmount() {

		return total;

	}



	public LocalDate getDate() {



		return oDate;



	}

	

	public String getOstatus() {

		return oStatus;

	}



	







}