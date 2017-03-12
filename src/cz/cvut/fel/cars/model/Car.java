package cz.cvut.fel.cars.model;

import java.util.UUID;

public class Car extends Engine {
	private String manufacturer;
	private String modelName;
	private int year;
	private UUID uuid;
	private static int count;
	private ServiceBook serviceBook;
	private int speed;
	
	public Car(String manufacturer,String modelName,int year,String type,int speed){
		this.manufacturer = manufacturer;
		this.modelName = modelName;
		this.year = year;
		this.uuid = this.vinCode();
		this.speed = speed;
		super.type = type;
		count++;
	}
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	private UUID vinCode(){
		return UUID.randomUUID();
	}
	public String toString(){
		return this.manufacturer+" "+this.modelName+" year "+this.year+" VIN: "+this.uuid;
	}
	public boolean equals(UUID car1, UUID car2){
		if(car1 == car2){
			return true;
		}else{
			return false;
		}
	}
	public int hashcode(){
		return this.hashCode();
	}
	public static int getNumberOfExistingCars(){
		return count;
	}

	public ServiceBook getServiceBook() {
		return serviceBook;
	}

	public void setServiceBook(ServiceBook serviceBook) {
		this.serviceBook = serviceBook;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
}
