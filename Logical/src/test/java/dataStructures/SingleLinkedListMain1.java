package dataStructures;

public class SingleLinkedListMain1 {

	public static void main(String[] args) {
		SingleLinkedList s1 = new SingleLinkedList();
		System.out.println(s1.add("suresh"));
		System.out.println(s1.add("ramesh"));
		System.out.println(s1.add("jagesh"));
		System.out.println(s1.add("ropesh"));
		s1.display();
		s1.addFirst("mahesh");
		s1.add("girish");
		s1.display();
		s1.add("ramesh", "Lokesh");
		s1.display();

		boolean b = s1.add("pranesh", "parmesh");
		System.out.println(b);
		int pos = s1.search("jagesh");
		System.out.println(pos);
		System.out.println(s1.delete("suresh"));
		s1.display();
		System.out.println(s1.delete("jagesh"));
		s1.display();
		System.out.println(s1.delete("pranesh"));
	}
}
