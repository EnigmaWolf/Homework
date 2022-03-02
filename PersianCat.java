package be.intecbrussel;

public class PersianCat extends Felis {
	/*
	 * + miauw()
	 */
		
	public void miauw() {
		System.out.println("Miauw!");
	}
	
	public PersianCat(String name, String breed, int age, int shelterNo, int badgeNo) {
		super(name, breed, age, shelterNo, badgeNo); 
	}

    private static int PersianCatCount;
    	
	public PersianCat () {
		PersianCatCount++;
		System.out.println("PersianCat Log Created");
		 
	 }
	public static int getPersianCatCount() {
		return PersianCatCount;
	}
	public void makesNoise () {
	    System.out.println("Miauw\n");
		}
	
}
