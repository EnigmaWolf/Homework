package testyourloops;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// int[] fizzgame= {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
		int[] game = {11,33,33,65,88,66,44,99,11};
		 
		for (int i = 0; i < game.length; i++) {
			for (int j = i + 1; j < game.length; j++) {
				if (game[i] == (game[j]))  {
					System.out.println("Found duplicate");
					System.out.println("Duplicate element is:" + game[j]);
				
				}
			}
				
		}
		System.out.println("No Duplicate Found");
		 
	}

}
