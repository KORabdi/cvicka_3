package cz.cvut.fel.cars.model.cars;

import cz.cvut.fel.cars.model.Car;
import cz.cvut.fel.pjv.TimeSpan;
import cz.cvut.fel.pjv.data.CarLinkedList;
import cz.cvut.fel.pjv.data.RaceResult;
import cz.cvut.fel.pjv.utils.ArrayUtil;

public class Race {
	private int length;
	private boolean status;
	private CarLinkedList carArr;
	private RaceResult[] results;
	
	public Race(int length){
		this.length = length;
		this.status = true;
		this.carArr = new CarLinkedList(this.length);
	}
	
	public boolean addRacingCar(Car car){
		if(this.status == true){
			this.carArr.addCar(car);
			return true;
		}else{
			return false;
		}
	}
	public Car getWinner(){
		return this.results[0].getKey();
	}
	
	public TimeSpan getWinningTime(){
		return this.results[0].getValue();
	}
	
	private RaceResult[] getRaceResults(){
		return carArr.toArray();
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public String toString(){
		if(this.status == true){
			this.results = this.getRaceResults();
			this.status = false;
		}else{
			ArrayUtil.sort(this.results);
		}
		String toRet = "";
		for(RaceResult result : this.results){
			toRet+= result.toString()+"\n\r";
		}
		return toRet;
	}
	
}
