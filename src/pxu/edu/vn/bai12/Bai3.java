package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		//Khai bao mang so thuc
		double[] a = new double[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = Math.random();
		}
		//Xuat gia tri mang
		for(double value: a) {
			System.out.print(value + " ");
		}
	}

}
