package com.prashant.datastructures.client;

import java.util.Scanner;

import com.prashant.datastructures.stack.LinkedStack;
import com.prashant.datastructures.stack.Stack;

public class Client {

	private Stack<String> stack;
	
	public void construcyStack(){
		System.out.println("DataStructures Client\n"
				+ "Enter 0 to exit\n"
				+ "Enter 1 to create LinkedStack");
		
		Scanner scanner = new Scanner(System.in);		
		int stackType =  scanner.nextInt();
		
		switch(stackType){
			case 0:
				stack = null;
				break;
			case 1:
				stack = new LinkedStack<String>(); 
				break;
			default:
				System.out.println("Invalid option, exiting\n");				
		}
		
	}
	
	public void runStack(){
		if(null == stack){
			return;
		}
		int option;
		boolean run = true;
		while(run) {
			System.out.println("Stack using LinkedList\n"
					+ "Enter 0 to exit\n"
					+ "Enter 1 to push\n"
					+ "Enter 2 to pop\n"
					+ "Enter 3 to display");
			Scanner scanner = new Scanner(System.in);
			option = scanner.nextInt();
			
			switch(option){
			case 0: run = false;
					break;
			case 1:
				System.out.println("Enter any data");
				String data = scanner.next();
				stack.push(data);
				break;
			case 2:
				stack.pop();
				break;
			case 3:
				//stack.display();
				
				//LinkedStack<String> ls = (LinkedStack<String>)stack;
				
				for(String s : stack) {
					System.out.println("| " + s + " |");
				}
					
				break;
			default:				
				System.out.println("Enter a valid option");
			}
		}
	}
	
	public static void main(String[] args) {

		Client client = new Client();
		client.construcyStack();
		client.runStack();		
		
	}

}
