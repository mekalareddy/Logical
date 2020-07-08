package dataStructures;

public class Stack {

	private Object ob[];
	int cpy, top;
	Stack(){
		ob = new Object[10];
		cpy = 5;
		top = -1;
	}

	public boolean push(Object obj) {
		if(top<cpy-1) {
			top++;
			ob[top] = obj;
			return true;
		}
		else {
			cpy = cpy+5;
			Object nob[] = new Object[cpy];
			for(int i=0; i<ob.length; i++) {
				nob[i] = ob[i];
			}
			ob = nob;
			top++;
			ob[top] = obj;
			return true;
		}

	}

	public Object pop() {
		if(top>-1) {
			return ob[top--];
		}
		System.out.println("Stack Under Flow");
		return false;
	}

	public Object peek() {
		if(top == -1) {
			System.out.println("Stack Under Flow");
			return null;
		}
		else
			return ob[top];
	}

	public String toString() {
		String st = "[";
		for(int i=top; i>=0; i--) {
			st = st + ob[i] + ",";
		}
		return st + "]";
	}

	public int getSize() {
		return top+1;
	}

	public int capacity() {
		return cpy;
	}

}
