/**
 * @author Omkar
 * @version 21-10-2024
 */
package com.mypackage;

/**
 *  vehicle class for vehicle methods and attributes
 */
public class Vehicle {

	private String name;
	private int speed;
	/**
	 * @param name
	 * @param speed
	 */
	public Vehicle(String name, int speed) throws InvalidSpeedException{
		if (speed < 0) {
			throw new InvalidSpeedException(name+" speed can not be negative "+speed);
	}
		this.name = name;
		this.speed = speed;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}
	
	
	
}
