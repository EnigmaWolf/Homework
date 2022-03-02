package be.intecbrussel;

public class TurkishVanCat extends Felis{
	/*
	 * + nickname: String
	 */
	
	public TurkishVanCat(String name, String breed, int age, int shelterNo, int badgeNo) {
		super(name, breed, age, shelterNo, badgeNo);
	}
	
	public String Nickname;
	
	
    private static int TurkishVanCatCount;
	
	public  TurkishVanCat () {
		TurkishVanCatCount++;
		System.out.println("TurkishVanCat Log Created");
		 
	 }
	public static int getTurkishVanCatCount() {
		return TurkishVanCatCount;
	}
	
	
	
}
