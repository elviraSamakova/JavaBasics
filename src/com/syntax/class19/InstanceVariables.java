package com.syntax.class19;



	public class InstanceVariables {

		String name="John";//instance variable
 
		public static void main(String[] args) {

			String name="Yunus";
			System.out.println(name); //1 local

			InstanceVariables object=new InstanceVariables();
			System.out.println(object.name); //2 john instance

			object.name="Ali"; //reass not john-->ali
			System.out.println(name); //3 yunus
			System.out.println(object.name); //4 ali

			//change value of local variable
			name="Farid"; 
			System.out.println(name); //5 not yunus--> farid
		}
	}


