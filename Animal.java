package be.intecbrussel;

import java.util.Objects;

public class Animal {
	/*
	 * # animalCount: int <<static>>
- size: char
- coat: char
- color: String
- weight: double
+ makeNoise(sound: String)
+ eat()
+ sleep()
+ isAlive() : boolean
	 */
	private char size;
	private char coat;
	private String colour;
	private String name;
    private double weight;
    private boolean isAlive = true;
       
    public Animal(String name, String colour, char size, char coat, double weight) {
    	this.name = name;
    	this.colour = colour;
    	this.size = size;
        this.coat = coat;
        this.weight = weight;        
    }
    
    public void eat() {
    	System.out.println("Animal is eating!");
    }
    
    public void sleep() {
    	System.out.println("Animal is sleeping");
    }
    
    public boolean isAlive() {
		return isAlive;
	}
    
    public Animal(double weight) {
    	this.weight = weight;
    }
    
	public char getSize() {
		return size;
	}

	public void setSize(char size) {
		this.size = size;
	}

	public char getCoat() {
		return coat;
	}

	public void setCoat(char coat) {
		this.coat = coat;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	 public void makesNoise() {	
		 System.out.println("The animal makes a sound:");
	    }
	 public void eats() {
		 System.out.println("The animal eats!");
	 }
	 public void sleeps() {
		 System.out.println("This animal sleeps!");
	 }
	       
	    private static int animalCount; 
	    public Animal() {
	    	animalCount++;

	    }
	    public static int getanimalCount() {
	    	return animalCount;
	    }

		@Override
		public String toString() {
			return "Animal [size=" + size + ", coat=" + coat + ", colour=" + colour + ", name=" + name + ", weight="
					+ weight + ", isAlive=" + isAlive + "]";
		}

		@Override
		public int hashCode() {
			return Objects.hash(isAlive);
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Animal other = (Animal) obj;
			return isAlive == other.isAlive;
		}

		

}
