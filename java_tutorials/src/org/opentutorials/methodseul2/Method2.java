package org.opentutorials.methodseul2;

public class Method2 {
	public static String numbering(int init, int limit){
		int i = init;
		String output ="";
		while (i < limit) {
			output += i;
			i++;
		}
		return output;
	}
	public static void main(String[] args) {
		String result = numbering(1,5);
		System.out.println(result);
		
	}
}
