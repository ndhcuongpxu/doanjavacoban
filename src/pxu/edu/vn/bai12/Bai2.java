package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("n = ");
		int n = sc.nextInt();
		int[] a = new int[n];
		System.out.println("NHAP GIA TRI CHO CAC PHAN TU CUA MANG");
		for(int i = 0; i < a.length; i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		System.out.println("XUAT GIA TRI CUA MANG");
		for(int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
