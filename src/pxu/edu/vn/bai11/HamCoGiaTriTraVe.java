package pxu.edu.vn.bai11;

import java.util.Scanner;

public class HamCoGiaTriTraVe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("He so a = ");
		double a = sc.nextDouble();
		System.out.print("He so b = ");
		double b = sc.nextDouble();
		System.out.print("He so c = ");
		double c = sc.nextDouble();
		System.out.print("Gia tri nguyen x = ");
		int x1 = sc.nextInt();
		System.out.print("Gia tri thuc x = ");
		double x2 = sc.nextDouble();
		double ketqua = tinhbieuthuc3(a, b, c, x1, x2);
		System.out.println("ket qua = " + ketqua);
	}
	
	public static double tinhbieuthucf1(double a, double b, double c, int x) {
		double result;
		result = a*x*x + b*x + c;
		return(result);
	}
	
	public static double tinhbieuthuc2(double x) {
		double result = 0;
		result = Math.log10(x) + 1/(Math.sqrt(Math.abs(Math.pow(x,  3) - 8)));
		return result;
	}
	
	public static double tinhbieuthuc3(double a, double b, double c, int x1, double x2) {
		double result = 0;
		result = tinhbieuthucf1(a, b, c, x1)/tinhbieuthuc2(x2);
		return result;
	}
}
