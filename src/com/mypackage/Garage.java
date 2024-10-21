/**
 * @author Omkar
 * @version 21-10-2024
 */
package com.mypackage;

/**
 * 
 */
public class Garage<T extends Vehicle> {
	private T vehicle;

	/**
	 * @param vehicle
	 */
	public Garage(T vehicle) {
		this.vehicle = vehicle;
	}
	
	public T getVehicle() {
		return vehicle;
	}
	
	public <U extends Vehicle> void compareSpeed(U otherVehicle) {
		if (vehicle.getSpeed() > otherVehicle.getSpeed() ) {
			System.out.println("\n"+vehicle.getName()+" is faster than "+otherVehicle.getName());
			
		}
		else if(vehicle.getSpeed() < otherVehicle.getSpeed() ) {
			System.out.println("\n"+vehicle.getName()+" is slower than "+otherVehicle.getName());
		}
		else {
			System.out.println("\n"+vehicle.getName()+" has same speed as of "+otherVehicle.getName());
		}
	}
	
}
