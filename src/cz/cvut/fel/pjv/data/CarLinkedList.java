package cz.cvut.fel.pjv.data;

import cz.cvut.fel.cars.model.Car;
import cz.cvut.fel.pjv.utils.ArrayUtil;

public class CarLinkedList {
	private CarListNode head;
	private int count = 0;
	private int length = 0;
	public CarLinkedList(int length){
		this.length = length;
	}
	
	public CarListNode getHead() {
		return head;
	}
	public void setHead(CarListNode head) {
		this.head = head;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public void addCar(Car car){
		CarListNode ncar = new CarListNode(car,this.length);
		if(this.head == null){
			this.head = ncar;
			this.count++;
			return;
		}
		CarListNode acar = this.head;
		while(acar.getNext() != null){
			acar = acar.getNext();
		}
		this.count++;
		acar.setNext(ncar);
	}
	public CarListNode getOne(){
		CarListNode toRet = this.head;
		this.head = this.head.getNext();
		return toRet;
	}
	public RaceResult[] toArray(){
		RaceResult[] carlist = new RaceResult[this.count];
		for(int i = 0;i<carlist.length;i++){
			carlist[i] = this.getOne().getData();
		}
		//ArrayUtil.sort(carlist);
		return carlist;
	}
}
