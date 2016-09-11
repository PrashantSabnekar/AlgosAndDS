package com.prashant.datastructures.stack;

public interface Stack<Item> extends Iterable<Item>{

	void push(Item data);	
	void pop();
	void display();
	
}
