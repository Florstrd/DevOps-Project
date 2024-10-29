package com.arcada.devops.dennis_project;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	while (true) {
    		System.out.println("Order Management System");
        	System.out.println("Enter number for function:");
        	System.out.println("1. Add order");
        	System.out.println("2. Edit order");
        	System.out.println("3. Remove order");
        	System.out.print("->");
        	
        	int userInput = input.nextInt();
    		if (userInput == 1) {
    			System.out.println("Add new order: ");
    			break;
    		} else if (userInput == 2) {
    			System.out.println(Orders.printOrders());
    			System.out.println("Edit order: ");
    			int editInput = input.nextInt();
    			Orders.getOrderInfo(editInput);
    			break;
    		} else if (userInput == 3) {
    			System.out.println("Remove order: ");
    			break;
    		} else {
    			System.out.println("Wrong input!");
    		}
    	}
    }
}