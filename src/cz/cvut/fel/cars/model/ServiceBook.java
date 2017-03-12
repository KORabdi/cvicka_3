package cz.cvut.fel.cars.model;

public class ServiceBook {
	private String[] serviceRecords = new String[100];
	private int counter = 0;

	public ServiceBook(Car car){
		car.setServiceBook(this);
	}

	public String[] getServiceRecords() {
		return serviceRecords;
	}

	public void setServiceRecords(String[] serviceRecords) {
		this.serviceRecords = serviceRecords;
	}
	
	public void addRecord(String text){
		this.serviceRecords[this.counter] = text;
		this.counter++;
	}
	
	@Override
	public String toString(){
		String str = "";
		int i = 0;
		while(this.serviceRecords[i] != null){
			str+= serviceRecords[i++] + "\r\n";
		}
		return str;
	}
	
}
