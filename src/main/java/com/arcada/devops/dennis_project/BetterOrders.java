package com.arcada.devops.dennis_project;

import java.util.HashMap;

public class BetterOrders {
	
	private static final HashMap<Integer, String> customers = new HashMap<Integer, String>();
	private static final HashMap<Integer, Integer> prices = new HashMap<Integer, Integer>();
	private static final HashMap<Integer, Integer> orderAmounts = new HashMap<Integer, Integer>();
	private static final HashMap<Integer, String> orderItems = new HashMap<Integer, String>();
	
	
	public static void printNames() {
		for (int id : customers.keySet()) {
			System.out.println(id +". " + customers.get(id));
		}
	}
	
	public static final String getName(final int id) {
		return customers.get(id);
	}
	
	public static final Integer getPrice(final int id) {
		return prices.get(id);
	}
	
	public static final Integer getAmount(final int id) {
		return orderAmounts.get(id);
	}
	
	public static final String getItems(final int id) {
		return orderItems.get(id);
	}
	
	static {
		
		customers.put(1, "NovaTech Solutions");
		customers.put(2, "GreenLeaf Innovations");
		customers.put(3, "StellarWave Media");
		customers.put(4, "Quantum Nest Designs");
		customers.put(5, "UrbanHive Marketing");
		customers.put(6, "BrightSky Ventures");
		customers.put(7, "EcoSphere Industries");
		customers.put(8, "Apex Horizon Consulting");
		customers.put(9, "Luminous Path Technologies");
		customers.put(10, "Driftwood Creations");
		
		prices.put(1, 100000);
		prices.put(2, 1000000);
		prices.put(3, 200000);
		prices.put(4, 3000000);
		prices.put(5, 50000);
		prices.put(6, 80000);
		prices.put(7, 100000);
		prices.put(8, 50000);
		prices.put(9, 1000000);
		prices.put(10, 10000);

		orderAmounts.put(1, 10000);
		orderAmounts.put(2, 10000);
		orderAmounts.put(3, 1000);
		orderAmounts.put(4, 100000);
		orderAmounts.put(5, 1000);
		orderAmounts.put(6, 4000);
		orderAmounts.put(7, 100000);
		orderAmounts.put(8, 100000);
		orderAmounts.put(9, 1000);
		orderAmounts.put(10, 10000);

		orderItems.put(1, "Keyboard");
		orderItems.put(2, "Computer");
		orderItems.put(3, "Monitor");
		orderItems.put(4, "Processor");
		orderItems.put(5, "TV");
		orderItems.put(6, "Window");
		orderItems.put(7, "Planter");
		orderItems.put(8, "Pen");
		orderItems.put(9, "Laptop");
		orderItems.put(10, "Book");

	}

}
