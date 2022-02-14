package be.intecbrussel.opdracht1;

public class IntArrayTools {


		public static void LOAD(int[] randomThirty) {

		    // looping through to assign random values from 1 - 300
		    for (int i = 0; i < randomThirty.length; i++) {
		        randomThirty[i] = (int)(Math.random() * 301); 
		            }
		    }

			 public static boolean isSorted(int[] a)
			    {
			        // base case
			        if (a == null || a.length <= 1) {
			            return true;
			        }

			        for (int i = 0; i < a.length - 1; i++)
			        {
			            if (a[i] > a[i + 1]) {
			                return false;
			            }
			        }

			        return true;
	}

}
