package org.opentutorials.arrayseul;

public class array {

	public static void main(String[] args) {
		String[] classGroup = {"a", "b", "c", "d"};
		int[] intGroup = new int[3];
		intGroup[0] = 3;
		intGroup[1] = 10;
		intGroup[2] = 20;
		
		System.out.println(intGroup[1] * intGroup[2]);
		
		for (int i=0; i<4; i++) {
			System.out.println(classGroup[i]);
		}
		
		for (String e : classGroup) {
			System.out.println(e + "!!");
		}
		
		for (int e : intGroup) {
			System.out.println(e*10);
		}
		System.out.println(classGroup.length);
		System.out.println(intGroup.length);
	}
}
