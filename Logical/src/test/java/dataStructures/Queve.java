package dataStructures;

public class Queve {

	Object ob[];
	int rear, front, cpy;

	Queve(int cpy){
		this.cpy = cpy;
		rear = front = - 1;
		ob = new Object[cpy];
	}

	boolean enque(Object obj) {
		if(rear == -1) {
			front++;
			rear++;
			ob[rear] = obj;
			return true;
		}
		else if(rear < cpy - 1) {
			rear++;
			ob[rear] = obj;
			return true;
		}
		else {
			System.out.println("Queve is full");
			return false;
		}
	}

	Object deque() {
		if(front == -1) {
			System.out.println("Queve is empty : ");
			return false;
		}
		else {
			Object o = ob[front];
			front++;
			if(front > rear)
				front = rear = -1;
			return o;
		}
	}

	void display() {
		for(int i=front; i<= rear; i++) {
			System.out.println(ob[i] + ",");
		}
		System.out.println();
	}

	Object peek() {
		if(front == -1) {
			System.out.println("Queve is empty : ");
			return false;
		}
		return ob[front];
	}

	int getSize() {
		return rear-front+1;
	}
}
