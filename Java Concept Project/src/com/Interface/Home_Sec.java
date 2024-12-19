package com.Interface;

interface Alarm {
	void activate();

	void deactivate();
}

class FireAlarm implements Alarm {
	public void activate() {
		System.out.println("The fire alarm is activated");
	}

	public void deactivate() {
		System.out.println("The fire alarm is deactivated");
	}
}

class BurglarAlarm implements Alarm {
	public void activate() {
		System.out.println("The Burglar alarm is activated");
	}

	public void deactivate() {
		System.out.println("The Burglar alarm is deactivated");
	}
}

public class Home_Sec {

	public static void main(String[] args) {
		FireAlarm f1 = new FireAlarm();
		f1.activate();
		f1.deactivate();
		BurglarAlarm b1 = new BurglarAlarm();
		b1.activate();
		b1.deactivate();
	}

}
