package com.syntax.class27;

public abstract class Food {
	String name;
	Food (String name){
		this.name=name;
	}
public abstract void cut();
public abstract void add(); 
public abstract void cook();
}

 class Plov extends Food {

	Plov(String name) {
		super(name);
		
	}

	@Override
	public void cut() {
		System.out.println(name+": cut meat,onion and carrots");
	}

	@Override
	public void add() {
		System.out.println("then add rice and water");
	}

	@Override
	public void cook() {
				System.out.println("and cook 20 minutes and enjoy!");
	}
}
class Lagman extends Food{
	Lagman (String name){
		super(name);
	}
	 
	public void cut() {
		System.out.println(name+": cut meat,onion, pepper and beans");
	}
	public void add() {
		System.out.println("then fry all");
	}
	public void cook() {
		System.out.println("cook noodles and add the souce.");
	}
	
}

class Bread extends Food{
	Bread (String name){
		super(name);
	}
	 
	public void cut() {
		System.out.println(name+": prepare flour, east and warm water");
	}
	public void add() {
		System.out.println("then mixed all");
	}
	public void cook() {
		System.out.println("after 30 minutes cook for 25 minutes");
	}
	
}