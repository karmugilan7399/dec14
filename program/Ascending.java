package org.program;

public class Ascending {
	public static void main(String[] args) {
		int[] ac = new int[] { 7, 5, 3, 2, 4, 1, 6 };
		
		for (int i = 0; i < ac.length; i++) {
			for (int j = 0; j < ac.length; j++) {

				//if (ac[i] < ac[j]) ------ Descending order
				
				if (ac[i] > ac[j]) {
					int temp = ac[i];
					ac[i] = ac[j];
					ac[j] = temp;

				}
			}
		}

		for (int i = 0; i < ac.length; i++) {

			System.out.println(ac[i]);

		}
	}
}


