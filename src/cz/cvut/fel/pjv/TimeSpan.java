package cz.cvut.fel.pjv;

public class TimeSpan {
	private int hours;
	private int minutes;
	private int seconds;
	public TimeSpan(){
		this.seconds = 0;
		this.minutes = 0;
		this.hours = 0;
	}
	public TimeSpan(TimeSpan time){
		this.seconds = time.getSeconds();
		this.minutes = time.getMinutes();
		this.hours = time.getHours();
	}
	public TimeSpan(int seconds){
		this.seconds = seconds % 60;
		this.minutes = seconds / 60 % 60;
		this.hours = this.minutes / 60;
	}
	public TimeSpan(int minutes,int seconds){
		if(seconds < 60){
			this.seconds = seconds;
		}else{
			this.seconds = 0;
		}
		this.minutes = minutes%60;
		this.hours = this.minutes / 60 % 60;
	}
	public TimeSpan(int hours,int minutes,int seconds){
		if(seconds < 60){
			this.seconds = seconds;
		}else{
			this.seconds = 0;
		}
		if(minutes < 60){
			this.minutes = minutes;
		}else{
			this.minutes = 0;
		}
		this.hours = hours;
	}
	public int getHours() {
		return hours;
	}
	public void setHours(int hours) {
		this.hours = hours;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public int getSeconds() {
		return seconds;
	}
	public void setSeconds(int seconds) {
		this.seconds = seconds;
	}
	public boolean equals(TimeSpan time1, TimeSpan time2){
		if(time1.seconds == time2.seconds){
			if(time1.minutes == time2.minutes){
				if(time1.hours == time2.hours){
					return true;
				}
			}
		}
		return false;
	}
	public int getTotalSeconds(){
		return this.seconds+60*this.minutes+60*60*this.hours;
	}
	
	public TimeSpan add(int seconds){
		this.seconds = this.seconds + seconds % 60;
		this.minutes = this.minutes + ((this.seconds + seconds) / 60) % 60;
		this.hours = this.hours + ((this.seconds + seconds) / (60*60));
		return this;
	}
	public String toString(){
		return this.hours+" hours "+this.minutes+" minutes "+this.seconds+" seconds";
	}
}
