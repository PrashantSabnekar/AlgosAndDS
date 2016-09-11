package com.prashant.datastructures.stack;

import java.util.Iterator;

public class LinkedStack<Item> implements Stack<Item> {

	private class Node{
		public Item data;
		public Node next;
	}
	
	private class LinkedListStackIterator implements Iterator<Item>{

		private Node currentNode = S;
		
		@Override
		public boolean hasNext() {
			return currentNode != null;
		}

		@Override
		public Item next() {
			Item current = currentNode.data;
			currentNode = currentNode.next;
			
			return current;
		}
		
	}
	
	private Node S = null;
	
	@Override
	public void push(Item data) {		
		Node old = S;
		S = new Node();
		S.data = data;
		S.next = old;
	}

	@Override
	public void pop() {
		if( null == S) {
			System.out.println("Stack Underflow");
		} else {
			System.out.println(S.data);
			S = S.next;
		}
	}
	
	@Override
	public void display() {
		Node n;
		n = S;
		while(null != S) {
			System.out.println("[ " + S.data + " ]");
			S = S.next;
		}		
		S = n;
	}
	
	private void displayWithIterator(){
		
	}

	@Override
	public Iterator<Item> iterator() {
		return new LinkedListStackIterator();
	}

}
