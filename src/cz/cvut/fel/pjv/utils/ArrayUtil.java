package cz.cvut.fel.pjv.utils;

import cz.cvut.fel.pjv.data.RaceResult;

public class ArrayUtil {
	
	private ArrayUtil(){
	}

	public static void sort(RaceResult[] carlist){
	    for (int i = 0; i < carlist.length - 1; i++) {
	        for (int j = 0; j < carlist.length - i - 1; j++) {
	        	System.out.println(carlist[1]);
	            if(carlist[j].getValue().getTotalSeconds() > carlist[j+1].getValue().getTotalSeconds()){
	            	RaceResult tmp = carlist[j];
	                carlist[j] = carlist[j+1];
	                carlist[j+1] = tmp;
	            }
	        }
	    }
	}             
}
