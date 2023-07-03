package pxu.edu.vn.bai11.baitap;

public class ViDuLoiGoiHam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.5;
		double b= 2.6;
		giaiptbac1(a, b);
		double g = 9.2;
		double z = 5.6;
		System.out.println("g = " + g + "; z = " + z);
		giaiptbac1(g, z);
	}

	public static void giaiptbac1(double a, double b) {
		System.out.println("a = " + a + "; b = " + b);
		if (a == 0) {
			if (b == 0) {
				System.out.println("PT co vo so nghiem");
			}else {
				System.out.println("Phuong trinh vo nghiem");
			}
		}else {
			//a != 0
			double x = -b/a;
			System.out.println("Nghiem x = " + x);
		}
	}
	
	public static void giaiptbac2(double a, double b, double c) {
		if(a == 0) {
			giaiptbac1(b, c);
		}else {
			System.out.println("a = " + a + "; b = " + b + "; c = " + c);
		}
	}
}
