/**
 * @author Omkar
 * @version 21-10-2024
 */
package com.mypackage;

/**
 * Main class
 */
public class VehicleExample {
	
	/**
	 * Main method
	 * @param args
	 */
	public  static void main(String[] args) {
		try {
			/**
			 * @param car object of Vehicle
			 * @param bike object of Vehicle
			 */
			Vehicle car = new Vehicle("Car",120);
			Vehicle bike =new Vehicle("Bike",80);
			
		
			try {
				Vehicle InvailVehicle = new Vehicle("Truck",-50);
				
			}catch(InvalidSpeedException e) {
				System.out.print(e.getMessage());
			}
			
			Garage<Vehicle> carGarage = new Garage<>(car);
			Garage<Vehicle> bikeGarage = new Garage<>(bike);
			
			System.out.println("\nCar speed "+carGarage.getVehicle().getSpeed());
			System.out.println("Bike speed "+bikeGarage.getVehicle().getSpeed());
			
			carGarage.compareSpeed(bikeGarage.getVehicle());
			
			SpeedOperations speedOps = new SpeedOperations();
			
			//lambda function is passed as an argument
			speedOps.applyOperation(bike, 10, (currentSpeed,amount) -> currentSpeed - amount );
						
		}catch (InvalidSpeedException e) {
			System.out.println("Error: "+ e.getMessage());
		}
		
	}
}
