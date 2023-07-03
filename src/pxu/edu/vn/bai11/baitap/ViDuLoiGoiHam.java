package pxu.edu.vn.bai11.baitap;

public class ViDuLoiGoiHam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		giaiptbac2(0, 6, 7);
	}

	public static void giaiptbac1(double a, double b) {
		System.out.println("a = " + a + "; b = " + b);
	}
	
	public static void giaiptbac2(double a, double b, double c) {
		if(a == 0) {
			giaiptbac1(b, c);
		}else {
			System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		}
	}
}
