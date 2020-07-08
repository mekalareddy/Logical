//Write a java program to create our own ArrayList.

package dataStructures;

public class JspList {

	int cp;
	Object ob[];
	int in;

	JspList(){
		cp = 10;
		in = -1;
		ob = new Object[cp];
	}
	JspList(int cp) {
		this.cp = cp;
		ob = new Object[cp];
		in = -1;
	}
	JspList(JspList j1){

	}

	boolean add(Object obj) {
		if(in == cp-1) {
			cp = cp*(3/2)+1;
			Object nob[] = new Object[cp];
			for(int i=0; i<=in; i++) {
				nob[i] = ob[i];
			}
			ob = nob;
		}
		in++;
		ob[in] = obj;
		return true;
	}

	boolean addFirst(Object obj) {
		if(in==cp-1) {
			cp = cp*(3/2)+1;
			Object nob[] = new Object[cp];
			for(int i=0; i<=in; i++) {
				nob[i] = ob[i];
			}
			ob = nob;
		}
		for(int i=in; i>0; i--) {
			ob[i+1] = ob[i];
		}
		in++;
		ob[0] = obj;
		return true;
	}

	Object remove() {
		if(in == -1)
			return false;
		else
			return ob[in-1];
	}
}
