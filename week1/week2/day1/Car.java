package week2.day1;

public class Car {
	
	
	public void driveCar(){
		System.out.println("drive car");
	}
	
	public void applyBrake() {
		System.out.println("apply brake");
	}
	
	public void soundHorn() {
		System.out.println("soundHorn");
	}
	
	public boolean isPuncture(boolean b) {
		
		System.out.println(b);
		return false;
		
	}

	public static void main(String[] args) {
		
		Car c=new Car();
		c.applyBrake();
		c.driveCar();
		c.soundHorn();
		c.isPuncture(true);
	}

}
