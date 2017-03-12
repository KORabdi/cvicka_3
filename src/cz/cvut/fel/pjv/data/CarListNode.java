package cz.cvut.fel.pjv.data;

import cz.cvut.fel.cars.model.Car;
import cz.cvut.fel.pjv.TimeSpan;

public class CarListNode {
	private RaceResult data;
	private CarListNode next;
	
	public CarListNode(Car car,int length){
		this.data = new RaceResult(car, new TimeSpan(length/car.getSpeed()));
	}
	public RaceResult getData() {
		return data;
	}
	public void setData(RaceResult data) {
		this.data = data;
	}
	public CarListNode getNext() {
		return next;
	}
	public void setNext(CarListNode next) {
		this.next = next;
	}
}
