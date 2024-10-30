package com.arcada.devops.dennis_project;

public class Orders {

	public static String printOrders() {
		String customer = 
				"1. NovaTech Solutions  \r\n"
				+ "2. GreenLeaf Innovations  \r\n"
				+ "3. StellarWave Media  \r\n"
				+ "4. Quantum Nest Designs  \r\n"
				+ "5. UrbanHive Marketing  \r\n"
				+ "6. BrightSky Ventures  \r\n"
				+ "7. EcoSphere Industries  \r\n"
				+ "8. Apex Horizon Consulting  \r\n"
				+ "9. Luminous Path Technologies  \r\n"
				+ "10. Driftwood Creations"; 
		
		return customer;
	}

	public static void getOrderInfo(int editInput) {
		if (editInput == 1) {
			System.out.println("NovaTech Solutions\r\n"
					+ "Price: 100 000€\r\n"
					+ "Amount: 10 000\r\n"
					+ "Item: Keyboard");
		}
		else if (editInput == 2) {
			System.out.println("GreenLeaf Innovations\r\n"
					+ "Price: 1 000 000€\r\n"
					+ "Amount: 10 000\r\n"
					+ "Item: Computer");
		}
		else if (editInput == 3) {
			System.out.println("StellarWave Media\r\n"
					+ "Price: 200 000€\r\n"
					+ "Amount: 1 000\r\n"
					+ "Item: Monitor");
		}
		else if (editInput == 4) {
			System.out.println("Quantum Nest Designs\r\n"
					+ "Price: 3 000 000€\r\n"
					+ "Amount: 100 000\r\n"
					+ "Item: Processor");
		}
		else if (editInput == 5) {
			System.out.println("UrbanHive Marketing\r\n"
					+ "Price: 50 000€\r\n"
					+ "Amount: 1 000\r\n"
					+ "Item: TV");
		}
		else if (editInput == 6) {
			System.out.println("BrightSky Ventures\r\n"
					+ "Price: 80 000€\r\n"
					+ "Amount: 4 000\r\n"
					+ "Item: Window");
		}
		else if (editInput == 7) {
			System.out.println("EcoSphere Industries\r\n"
					+ "Price: 100 000€\r\n"
					+ "Amount: 100 000\r\n"
					+ "Item: Planter");
		}
		else if (editInput == 8) {
			System.out.println("Apex Horizon Consulting\r\n"
					+ "Price: 50 000€\r\n"
					+ "Amount: 100 000\r\n"
					+ "Item: Pen");
		}
		else if (editInput == 9) {
			System.out.println("Luminous Path Technologies\r\n"
					+ "Price: 1 000 000€\r\n"
					+ "Amount: 1 000\r\n"
					+ "Item: Laptop");
		}
		else if (editInput == 10) {
			System.out.println("Driftwood Creations\r\n"
					+ "Price: 10 000€\r\n"
					+ "Amount: 10 000\r\n"
					+ "Item: Book");
		}
		else {
			System.out.println("No order matching " + editInput);
		}
	}

}
