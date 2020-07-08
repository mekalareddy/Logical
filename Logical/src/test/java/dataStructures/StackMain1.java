package dataStructures;

public class StackMain1 {

	public static void main(String[] args) {
		Stack sk = new Stack();
		sk.push("jsp");
		sk.push(new Integer(123));
		sk.push(new Character('r'));
		System.out.println(sk.push(null));
		sk.push("ding");
		System.out.println(sk);
		System.out.println("Capacity : " + sk.capacity());
		sk.push("manager");
		System.out.println(sk);
		System.out.println("Capacity : " + sk.capacity());
		System.out.println("-----------");
		System.out.println("Size : " + sk.getSize());
		System.out.println(sk.pop());
		System.out.println(sk.pop());
		System.out.println("Size : " + sk.getSize());
		System.out.println(sk.pop());
		System.out.println("-----------");
		System.out.println(sk.peek());
		System.out.println(sk.peek());
		System.out.println("Size : " + sk.getSize());
		System.out.println("-----------");
		System.out.println(sk);
	}

}
