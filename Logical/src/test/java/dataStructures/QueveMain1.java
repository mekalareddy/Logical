package dataStructures;

public class QueveMain1 {

	public static void main(String[] args) {
		Queve q1 = new Queve(5);
		System.out.println(q1.enque("dinga"));
		System.out.println(q1.enque("Linga"));
		System.out.println(q1.enque("Manga"));
		System.out.println(q1.enque("Pinga"));
		System.out.println("Size : "+q1.getSize());
		System.out.println(q1.enque("Punga"));
		System.out.println(q1.enque("ranga"));
		q1.display();
		System.out.println("*****");
		System.out.println(q1.deque());
		System.out.println(q1.deque());
		q1.display();
		System.out.println(q1.deque());
		System.out.println("Size : "+q1.getSize());
		System.out.println(q1.deque());
		System.out.println("*****");
		System.out.println(q1.peek());
		System.out.println(q1.deque());
	}
}
