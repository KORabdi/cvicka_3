package cz.cvut.fel.pjv.data;

import cz.cvut.fel.cars.model.Car;
import cz.cvut.fel.pjv.TimeSpan;

public class RaceResult {
	private Car key;
	private TimeSpan value;
	public RaceResult(Car car,TimeSpan time){
		this.key = car;
		this.value = time;
	}
	public Car getKey() {
		return key;
	}
	public void setKey(Car key) {
		this.key = key;
	}
	public TimeSpan getValue() {
		return value;
	}
	public void setValue(TimeSpan value) {
		this.value = value;
	}
	public String toString(){
		return this.key.toString();
	}
}
