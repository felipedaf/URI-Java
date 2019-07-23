package beginner;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class MakingPairs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int peopleQnt = sc.nextInt();
			
			int friendsPairs = sc.nextInt();
			
			int possiblePairs = sc.nextInt();
						
			boolean[][] friendList = new boolean[peopleQnt][peopleQnt + 1];
			
			for(int i = 0; i < friendsPairs; i++) {
				int num1 = sc.nextInt();
				int num2 = sc.nextInt();
				
				
				
			}
			
		}
		sc.close();
	}
	
}
class Node{
	private Integer data;
	private Node previous;
	private Node next;
	
	public Node(Integer data, Node previous, Node next) {
		this.data = data;
		this.previous = previous;
		this.next = next;
	}
	
	public Integer getData() {
		return data;
	}
	
	public Node getNext() {
		return next;
	}
	
	public Node getPrevious() {
		return previous;
	}
	
	public void setPrevious(Node previous) {
		this.previous = previous;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
}

class MyList{
	private Node root;
	private Node last;
	private boolean[] contain;
	private int size;
	
	public MyList(int size) {
		contain = new boolean[size];
		this.size = 0;
	}
	
	public void add(int element) {
		if(!this.contain[element - 1]) {
			if(root == null) {
				root = new Node(element, null, null);
				last = root;
			}
			else {
				Node newNode = new Node(element, last, null);
				this.last.setNext(newNode);
				this.last = newNode;
			}
			size++;
			this.contain[element - 1] = true;
		}
	}
	
	public boolean contains(int element) {
		return this.contain[element - 1];
	}
}
