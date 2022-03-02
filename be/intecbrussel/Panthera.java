package be.intecbrussel;

public class Panthera extends Animal {
/*
 * + roar(): String
   + hunt()
 */
	String breed;
	
	Panthera(String breed) {
		this.breed = breed;
	}
	
	public void makesNoise () {
	    System.out.println("Roarr");
		}
	public void hunt () {
	    System.out.println("This animal hunts!");
		}
	public String toString(){//overriding the toString() method  
		  return breed;  
		 } 
}
