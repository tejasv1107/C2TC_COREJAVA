package linkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class LList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> l1 = new LinkedList<>();
		//adding elements to linked list
		l1.add(3);
		l1.add(7);
		l1.add(10);
		l1.add(2,6);
		//remove elements from linked list
		l1.remove(2);
		l1.removeFirst();
		l1.removeLast();
		
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println(l1.size());
		boolean b1 = l1.contains(7);
		System.out.println(b1);
		//copy elements from stack to linked list
		Stack<String> s1 = new Stack<>();
		LinkedList<String> l2 = new LinkedList<>();
		
		s1.push("hello");
		s1.push("everyone");
		l2.addAll(s1);
		
		Iterator it1 = l2.iterator();
		while(it1.hasNext()) {
			System.out.println(it.next()+" ");
		}
		
	}

}
