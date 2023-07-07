package pxu.edu.vn.bai12;

public class Bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2, 0, 2, 1};
		//Cach 1
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		
		//Cach 2
		for(int value: a) {
			System.out.print(value + " ");
		}
	}

}
