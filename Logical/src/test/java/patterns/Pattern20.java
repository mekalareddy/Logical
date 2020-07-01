package patterns;

public class Pattern20 {

	public static void main(String[] args) {

		int n=9;
		int sp = n/2;
		int el = 0;

		for(int i=0; i<n; i++) {
			for(int k=0; k<sp; k++) 
				System.out.print(" ");
			int num = 1;
			for(int j=0; j<=el; j++) {
				System.out.print(num + " ");
				num = num * (el-j)/(j+1);
			}
			if(i<n/2) {
				sp--;
				el++;
			}
			else {
				sp++;
				el--;
			}
			System.out.println();
		}

	}

}
