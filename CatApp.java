package be.intecbrussel;

public class CatApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SiameseCat cat1 = new SiameseCat("Bambi", "Siamese Cat", 2, 3554, 2551);
		SiameseCat cat2 = new SiameseCat("Teddy", "Siamese Cat", 5, 3554, 2552);
		AndeanMountainCat cat3 = new AndeanMountainCat("Tom", "AndeanMountain Cat", 2, 3554, 2553);
		TurkishVanCat cat4 = new TurkishVanCat("Moby", "TurkishVan Cat", 3, 3554, 2554);
		TurkishVanCat cat5 = new TurkishVanCat("Tim", "TurkishVan Cat", 1, 3554, 2555);
		NorwegianForestCat cat6 = new NorwegianForestCat("Sandy", "NorwegianForest Cat", 1, 3554, 2556); 
		PersianCat cat7 = new PersianCat("Polly", "Persian Cat", 3, 3554, 2556);
		PersianCat cat8 = new PersianCat("May", "Persian Cat", 8, 3554, 2557);
		Panthera animal1 = new Panthera("A panther");
		Acinonyx animal2 = new Acinonyx("An Acinonyx");
		
		Animal[] animalArray = { animal1 , animal2};
		for(Animal a : animalArray) {
			System.out.println(a);
		}
		
		Felis[] felisArray = {cat1 , cat2, cat3, cat4, cat5, cat6, cat7, cat8};
		for(Felis f : felisArray) {
			System.out.println(f);
		}
				
		System.out.println("You have: " + Animal.getanimalCount() + " Animals in the Shelter.");
		System.out.println("You have: " + Felis.getfelisCount() + " Small cats in the Shelter.");
		System.out.println("No of vaccinated cats:" + Felis.getVaccinationCount());

		
	
		
		

	}

}
