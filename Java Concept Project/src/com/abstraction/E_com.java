package com.abstraction;

abstract class Product{
	abstract void calculatePrice();
}
class Electronics extends Product{
	String name;
	int price;
	int tax;
	Electronics(String name,int price,int tax){
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	void calculatePrice(){
		int curr_price = price + this.tax;
		System.out.println("The name of the product is :"+ this.name);
		System.out.println("The price of the product is :"+this.price);
		System.out.println("The tax of the product is :"+this.tax);
		System.out.println("The current price of the product is :"+curr_price);

	}
}
class Clothing extends Product{
	String name;
	int price;
	int tax;
	Clothing(String name,int price,int tax){
		this.name = name;
		this.price = price;
		this.tax = tax;
	}
	void calculatePrice(){
		int curr_price = price + this.tax;
		System.out.println("The name of the product is :"+ this.name);
		System.out.println("The price of the product is :"+this.price);
		System.out.println("The tax of the product is :"+this.tax);
		System.out.println("The current price of the product is :"+curr_price);
	}
}

public class E_com {

	public static void main(String[] args) {
		Electronics e1 = new Electronics("Sriram",2000,50);
		e1.calculatePrice();
		Clothing c1 = new Clothing("Sriram", 5000 , 90);
		c1.calculatePrice();
	}

}
