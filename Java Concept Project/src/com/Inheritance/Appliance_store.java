package com.Inheritance;

class Appliance{
	String brand;
	String model;
	Appliance(String brand,String model){
		this.brand = brand;
		this.model = model;
	}
	void displayApplianceInfo(){
		System.out.println("The Appliance brand is : "+this.brand);
		System.out.println("The Appliance model is : "+this.model);
	}
}
class WashingMachine extends Appliance{
	int load_cap;
	int spin_speed;
	int energy;
	WashingMachine(String brand,String model,int load_cap,int spin_speed,int energy){
		super(brand,model);
		this.load_cap = load_cap;
		this.spin_speed = spin_speed;
		this.energy = energy;
	}
	void displayWashingMachineInfo(){
		System.out.println("The Washing Machine brand is : "+this.brand);
		System.out.println("The Washing Machine model is : "+this.model);
		System.out.println("The Washing Machine load capacity is : "+this.load_cap);
		System.out.println("The Washing Machine spin speed is : "+this.spin_speed);
	}
	void calculateEnergyConsumption(){
		int energy_meas = energy * 12;
		System.out.println("The energy consumed is : " + energy_meas);
	}
}
class Refrigerator extends Appliance{
	int capacity;
	int ener_rate;
	int energy;
	Refrigerator(String brand,String model,int capacity,int ener_rate,int energy){
		super(brand,model);
		this.capacity = capacity;
		this.ener_rate = ener_rate;
		this.energy = energy;
	}
	void displayRefrigeratorInfo(){
		System.out.println("The Refrigirator brand is : "+this.brand);
		System.out.println("The Refrigirator model is : "+this.model);
		System.out.println("The Refrigirator load capacity is : "+this.capacity);
		System.out.println("The Refrigirator spin energy rating is : "+this.ener_rate);
	}
	void calculateEnergyConsumption(){
		int energy_meas = energy * 12;
		System.out.println("The energy consumed is : " + energy_meas);
	}
}
public class Appliance_store {

	public static void main(String[] args) {
		Appliance a1 = new Appliance("Samsung","V1");
		a1.displayApplianceInfo();
		WashingMachine w1 = new WashingMachine("Samsung","V1",10,4,70); 
		w1.displayWashingMachineInfo();
		w1.calculateEnergyConsumption();
	}

}
