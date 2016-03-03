package org.opentutorials.loopseul;

public class Loop {

	public static void main(String[] args) {
		int i = 0;
		while (i<10) {
			//if (i == 5)
				//continue;
			System.out.println(i);
			i++;
			
		}
		
		System.out.println("\n");
		
		for (int j=0; j < 10; j++) {
			if (j == 6)
				continue;
			System.out.println(j);
		}
	}

}
