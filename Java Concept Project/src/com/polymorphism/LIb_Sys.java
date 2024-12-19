package com.polymorphism;

abstract class LibraryItem {
	abstract void displayInfo();
}

class Book extends LibraryItem {
	String name;
	String author;
	int id;

	Book(String name, String author, int id) {
		this.name = name;
		this.author = author;
		this.id = id;
	}

	void displayInfo() {
		System.out.println("The Book name is :" + this.name);
		System.out.println("The Book author is :" + this.author);
		System.out.println("The Book id is :" + this.id);
	}
}
class Magazine extends LibraryItem{
	String name;
	String author;
	int id;

	Magazine(String name, String author, int id) {
		this.name = name;
		this.author = author;
		this.id = id;
	}
	void displayInfo(){
		System.out.println("The Magazine name is :" + this.name);
		System.out.println("The Magazine author is :" + this.author);
		System.out.println("The Magazine id is :" + this.id);
	}
}

public class LIb_Sys {

	public static void main(String[] args) {
		Book b1 = new Book("The killer","Sriram",1001);
		b1.displayInfo();
		Magazine m1 = new Magazine("How life works","Jamie",100);
		m1.displayInfo();
	}

}
