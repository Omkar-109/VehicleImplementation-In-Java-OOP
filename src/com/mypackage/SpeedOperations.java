/**
 * @author Omkar
 * @version 21-10-2024
 */
package com.mypackage;

/**
 * 
 */
public class SpeedOperations {
	public void applyOperation(Vehicle vehicle, int amount, SpeedOperation operation) {
		int newSpeed = operation.changeSpeed(vehicle.getSpeed(), amount);
		System.out.println(vehicle.getName()+" now has a speed of "+newSpeed+" km/hr");
	}
}
