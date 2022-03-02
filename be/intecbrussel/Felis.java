package be.intecbrussel;

import java.util.Objects;

public class Felis extends Animal {
	
	/*
	 * vaccitationCount: int <<static>>
        - name: String
        - age: int
        - shelterNo: int
        - badgeNo: int
        + miauw()
        + miauw(int times)
        + getNoOfVaccinatedCats(): int <<static>>
        Static void Felis.getVaccinationCount();
	 */
	
	
	private String name;
	private String breed;
	static int VaccinationCount;
	static int getNoOfVaccinatedCats;
	private int age;
	private int shelterNo;
	private int badgeNo;
	private int miauw;
	
	{
		felisCount++;
		if (this.isAlive()) {
			VaccinationCount++;
		}
	}

    public Felis (String name, String breed, int age, int shelterNo, int badgeNo) {
    	this.name = name;
    	this.breed = breed;
    	this.age = age;
    	this.shelterNo = shelterNo;
    	this.badgeNo = badgeNo;
    }
    
    public void miauw () {
    	System.out.println("This cat is miauwing!");
    }
    public Felis (int miauw) {
    	this.miauw = miauw;
    }
    
	public static int getVaccinationCount() {
		return VaccinationCount;
	}

	public void setVaccinationCount(int vaccinationCount) {
		VaccinationCount = vaccinationCount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getBreed() {
		return breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getShelterNo() {
		return shelterNo;
	}

	public void setShelterNo(int shelterNo) {
		this.shelterNo = shelterNo;
	}

	public int getBadgeNo() {
		return badgeNo;
	}

	public void setBadgeNo(int badgeNo) {
		this.badgeNo = badgeNo;
	}
	
	 public int getMiauw() {
		return miauw;
	}

	public void setMiauw(int miauw) {
		this.miauw = miauw;
	}



	private static int felisCount; 
	    public Felis() {
	    	System.out.println("test");

	    }
	    public static int getfelisCount() {
	    	return felisCount;
	    }
	
	@Override
	public String toString() {
		return "Felis [name=" + name + ", breed=" + breed + ", age=" + age
				+ ", shelterNo=" + shelterNo + ", badgeNo=" + badgeNo + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(badgeNo, shelterNo);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Felis other = (Felis) obj;
		return badgeNo == other.badgeNo && shelterNo == other.shelterNo;
	}
    
	
    
}
    
    