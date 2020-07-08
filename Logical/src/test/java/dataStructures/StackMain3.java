//Write a java program to evaluate postfix expression by using STACK.
//EX : 234*+ = 2+3*4

package dataStructures;

public class StackMain3 {

	public static void main(String[] args) {

		String st = "234*+";

		char ch[] = st.toCharArray();

		Stack stk = new Stack();

		for(int i = 0; i<ch.length; i++) {

			if(ch[i] >= 48 && ch[i] <= 57)
				stk.push(ch[i]-48);
			else {
				int b = (int)stk.pop();
				int a = (int)stk.pop();

				switch(ch[i]){
				case '+' : 
					stk.push(a+b);
					break;
				case '-' : 
					stk.push(a-b);
					break;
				case '*' : 
					stk.push(a*b);
					break;
				}

			}
		}
		System.out.println(stk.pop());
	}
}
