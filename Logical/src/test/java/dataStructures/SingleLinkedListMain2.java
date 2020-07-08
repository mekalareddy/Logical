//Write a java program to reverse stored values & display it.

package dataStructures;

public class SingleLinkedListMain2 {

	static void reverse(Node N) {
		if(N == null)
			return;
		reverse(N.link);
		System.out.println(N.data);
	}

}
