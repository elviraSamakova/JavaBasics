package com.syntax.class14;

public class Dog {

	// define features of the dogs

	String breed;
	String color;
	String name;
	int age;

	public static void main(String[] args) {
// build individual object
		Dog dog1 = new Dog();

		dog1.breed = "Afador";
		dog1.color = "Black";
		dog1.name = "Lucky";
		dog1.age = 1;

		Dog dog2 = new Dog();

		dog2.breed = "Akbash";
		dog2.color = "White";
		dog2.name = "Boss";
		dog2.age = 3;

		// print I have a white akbash named boss

		System.out.println("I have a " + dog2.color + " " + dog2.breed + " named " + dog2.name);
		
		//accesing behavior/
		dog2.bark();
		dog2.run();
		dog2.eat();
	}

	// define behavior
	void bark() {
		System.out.println("Dog can bark");
	}

	void run() {
		System.out.println("Dog can run fast");
	}

	void eat() {
		System.out.println("Dog eat dog food");
	}
}
