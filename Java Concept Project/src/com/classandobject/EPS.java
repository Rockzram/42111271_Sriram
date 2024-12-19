package com.classandobject;

class Employee {
	int emp_id;
	String name;
	String pos;
	int salary;

	Employee(int emp_id, String name, String pos, int salary) {
		this.emp_id = emp_id;
		this.name = name;
		this.pos = pos;
		this.salary = salary;
	}

	void displayEmployeeInfo() {
		System.out.println("The Employee id is :" + this.emp_id);
		System.out.println("The Employee name is :" + this.name);
		System.out.println("The Employee position is :" + this.pos);
		System.out.println("The Employee salary is :" + this.salary);
	}

	int calculateAnnualSalary() {
		salary = salary * 2 + 10000;
		System.out.println("The salary amount after the year :" + salary);
		return salary;
	}
}
public class EPS {
	public static void main(String[] args) {
		Employee e1 = new Employee(2001,"Sriram","Manager",200550);
		e1.displayEmployeeInfo();
		e1.calculateAnnualSalary();
	}

}
