package com.syntax.class09;

public class MileageNestedLoop {

	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {

			for (int y = 0; y < 10; y++) {

				for (int z = 0; z < 10; z++) {

					for (int w = 0; w < 10; w++) {

					System.out.println(i + "" + y+""+z + "" + w);
					}
				}
				
			}
		}

	}

}
