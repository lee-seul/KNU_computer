package org.opentutorials.methodseul;

public class Method {
	public static void numbering(int limit) { //integer limit == 매개변수 parameter
		int i = 0;
		while (i<limit){
			System.out.println(i);
			i++;
		}
	}
	
	public static void main(String[] args) {
		for (int j = 0; j < 5; j++){
			numbering(2); //2 ==  인자 argument
		}
	}
	

}
