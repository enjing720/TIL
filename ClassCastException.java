// Class Cast Exception
package kr.co.multicampus_2;

public class ClassCastException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	public static void changeDog(Animal animal) {
		//(if animal instance of Dog) {
		Dog dog = (Dog) animal; 	// class cast Exception 발생 가능성
	}
}
