//Write a java program to find String is balanced/not?

package dataStructures;

public class StackMain2 {

	public static void main(String[] args) {

		Stack stk = new Stack();

		String st = "{[()]}";

		char ch[] = st.toCharArray();

		int find = 0;

		for(int i=0; i<ch.length; i++) {

			char t = ch[i];

			if(t == '(' || t == '{' || t == '[')
				stk.push(t);
			else {
				char ch1 = (char) stk.pop();

				switch(t){
				case '}' :
					if(ch1!= '{')
						find = 1;
					break;
				case ']' :
					if(ch1!= '[')
						find = 1;
					break;
				case ')' :
					if(ch1!= '(')
						find = 1;
					break;
				}

				if(find == 1)
					break;
			}
		}

		if(find == 0) {
			if(stk.top == -1)
				System.out.println("String is balanced");
			else
				System.out.println("String is not balanced");
		}
		else
			System.out.println("String is not balanced");
	}
}
