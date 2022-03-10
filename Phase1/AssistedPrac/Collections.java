package AssistedPracProj;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		// arraylist
		System.out.println("ArrayList");
		ArrayList<String> a = new ArrayList<String>();

		a.add("Bangalore");//
		a.add("Delhi");
		Iterator al = a.iterator();
		while (al.hasNext()) {
			System.out.println(al.next());
		}

		// vector
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer> b = new Vector();
		b.addElement(15);
		b.addElement(30);
		System.out.println(b);

		// linkedlist
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String> names = new LinkedList<String>();
		names.add("Alex");
		names.add("John");
		System.out.println("Linkedlist " + names);
		Iterator itr = names.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());

		// hashset
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(101);
		set.add(103);
		set.add(103);
		set.add(104);
		System.out.println(set);

		// linkedhashset
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer> set2 = new LinkedHashSet<Integer>();
		set2.add(11);
		set2.add(14);
		set2.add(12);
		set2.add(14);
		System.out.println(set2);
		}
	}
}
