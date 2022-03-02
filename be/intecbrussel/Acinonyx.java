package be.intecbrussel;

public class Acinonyx extends Animal{ 
	/*
	 * - speed: double
       + run(distance: double)
       + kiauuww()
       This cat is not alive anymore and cannot be vaccinated 
	 */

	
	private double Speed;
	private double Distance;
	private String breed;
	private String Kiauww;
	
	
	Acinonyx(String breed) {
		this.breed = breed;
	}
	
	public void run(double Speed, double Distance) {
		this.Speed = Speed;
		this.Distance = Distance;
	}
	
	public double getSpeed() {
		return Speed;
	}

	public void setSpeed(double speed) {
		Speed = speed;
	}

	public double getDistance() {
		return Distance;
	}

	public void setDistance(double distance) {
		Distance = distance;
	}
	
	public String getKiauww() {
		return Kiauww;
	}

	public void setKiauww(String kiauww) {
		Kiauww = kiauww;
	}
		
	public void makesNoise () {
	    System.out.println("This cat Miauws in Norwegian!");
		}

	@Override
	public String toString() {
		return "Acinonyx [Speed=" + Speed + ", Distance=" + Distance + ", breed=" + breed + "]";
	}

	

	
	
	
	
}
