package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Buoc 1: Nhap so phan tu cua mang
		int n= nhapsophantucuamang();
	}

	//Ham nhap so phan tu cua mang
	public static int nhapsophantucuamang() {
		int n = 0;
		try {
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("n = ");
				n = sc.nextInt();
			}while(n <= 0);
			return n;
		}catch(Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
			return(-1);
		}
	}
}
