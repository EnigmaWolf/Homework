package be.intecbrussel;

public class AndeanMountainCat extends Felis {
	/*
	 * + miauw(customSound: String)
       + isAlive()
       This cat is not alive anymore and cannot be vaccinated
       AndeanMountainCat amc = new AndeanMountainCat();
       Felis.getVaccinationCount();
       If there are 5 cats and one of them is AndeanMountainCat
       getVaccinationCount method must return 4;
       check the cat isAlive() or you can use setters to change
       the value of vaccinationCount.
	 */
		
	public AndeanMountainCat(String name, String breed, int age, int shelterNo, int badgeNo) {
		super(name, breed, age, shelterNo, badgeNo);
	}
		
	@Override
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return false;
	}
	 public void makesNoise() {
		 System.out.println("The Andean Mountain Cat: Miauws ");
	 }
	 
}
