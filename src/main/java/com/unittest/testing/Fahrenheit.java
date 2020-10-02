package com.unittest.testing;

public class Fahrenheit {
	
	private double celcius;
	private double fahrenhiet;
	
	public double getFahrenhiet() {
		return fahrenhiet;
	}

	public void setFahrenhiet(double fahrenhiet) {
		this.fahrenhiet = fahrenhiet;
	}

	public double getCelcius() {
		return celcius;
	}

	public void input(double celcius) {
		this.celcius = celcius;
		
	}
	public boolean isBound(double celcius) {
		boolean isresult;
		if(celcius  >= -1000 && celcius <= 1000) {
			isresult = true;
		}else {
			isresult = false;
		}
		return isresult ;
	}
	
	public void calculate() {
		this.fahrenhiet = this.celcius*9/5+32;
	
	}
	
	
	public String toString() {
		double fahrenhiet = this.getFahrenhiet();
		double celcius = this.getCelcius();
		return Math.round(celcius)+" celcius = "+String.format("%.2f",fahrenhiet)+" fahrenheit";
	}
	
	
	
	
	
	
	
}
