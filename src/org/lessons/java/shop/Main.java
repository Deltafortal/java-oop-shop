package org.lessons.java.shop;

import java.util.Random;

public class Main {

	
	public static void main(String[] args) {
		
		
		Random rnd = new Random();
		String[] products = {"Laptop", "Smartphone", "Mouse", "Tastiera", "Auricolari", "Monitor", "Stampante", "Fotocamera", "Tablet", "Altoparlante"};

		
		
		//Main logic
		for(int i = 0; i < 10; i++) {
			
			//Constructor
			Prodotto prod = new Prodotto(rnd.nextInt(10001), products[rnd.nextInt(10)], "Un bel prodotto", rnd.nextDouble(101), rnd.nextInt(70));
			
			
			System.out.println(prod);
			System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------");
		}
		
		
	}
	
}
