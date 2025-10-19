package cjcc004_day1;
//9.Class and Object
/* Inheritance  and Polymorphism */
class Animal{
	void sound() {
		System.out.println("Animal sound");
	}
}

class Dog extends Animal{
	void bark() {
		System.out.println("Woof!");
	}
	void shout() {
		System.out.println("Dog shouting ->Wooooooooww");
	}
}
class Cat extends Animal{
	void shout() {
		System.out.println("Cat shouting ->Meow");
	}
}

public class Main {

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.bark();
		d.shout();
		Cat c = new Cat();
		c.shout();

	}

}
