package com.grind.imp;

import java.util.HashMap;
import java.util.Map;

class LRUCache {

	private final int capacity;
	private int size;
	private Map<Integer, Node> map;
	private DoublyLinkedList lst;

	public LRUCache(int capacity) {
		this.capacity = capacity;
		map = new HashMap<>();
		lst = new DoublyLinkedList();
		this.size = 0;
	}

	public int get(int key) {
		Node node = map.get(key);
		if (map.get(key) == null) {
			return -1;
		}
		lst.moveNodeToFront(node);
		return node.val;
	}

	public void put(int key, int value) {
		Node node = map.get(key);
		if (map.get(key) != null) {
			node.val = value;
			lst.moveNodeToFront(node);
			return;
		}
		if (size == capacity) {
			int rearKey = lst.getRearKey();
			lst.removeRearNode();
			map.remove(rearKey);
			size--;
		}
		node = new Node(key, value);
		lst.addNodeToFront(node);
		map.put(key, node);
		size++;
	}

	public class Node {
		public int key, val;
		public Node prev, next;

		public Node(int key, int val) {
			this.key = key;
			this.val = val;
			this.prev = null;
			this.next = null;
		}
	}

	public class DoublyLinkedList {
		Node front, rear;

		public DoublyLinkedList() {
			front = rear = null;
		}

		private void addNodeToFront(final Node node) {
			if (rear == null) {
				front = rear = node;
				return;
			}
			node.next = front;
			front.prev = node;
			front = node;
		}

		public void moveNodeToFront(final Node node) {
			if (front == node) {
				return;
			}

			if (node == rear) {
				rear = rear.prev;
				rear.next = null;
			} else {
				node.prev.next = node.next;
				node.next.prev = node.prev;
			}

			node.prev = null;
			node.next = front;
			front.prev = node;
			front = node;
		}

		public void removeRearNode() {
			if (rear == null) {
				return;
			}
			if (front == rear) {
				front = rear = null;
			} else {
				rear = rear.prev;
				rear.next = null;
			}
		}

		public int getRearKey() {
			return rear.key;
		}
	}

}