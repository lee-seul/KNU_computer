package dog;

class Animal{
	public void sound(){
		
	}
}

class Dog extends Animal{
	public void sound(){
		System.out.println("멍멍!");
	}
}

public class DogTest {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();

	}

}
