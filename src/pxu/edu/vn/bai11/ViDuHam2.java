package pxu.edu.vn.bai11;

import java.util.Scanner;

public class ViDuHam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tinhbieuthuc();
		tinhbieuthuc();
		tinhbieuthuc();

	}

	public static void tinhbieuthuc() {
		Scanner sc = new Scanner(System.in);
		System.out.print("a = ");
		double a = sc.nextDouble();
		System.out.print("b = ");
		double b = sc.nextDouble();
		System.out.print("c = ");
		double c = sc.nextDouble();
		System.out.print("x = ");
		double x = sc.nextDouble();
		double f = a * x * x + b * x + c;
		System.out.println("f(x) = " + f);
	}
}
