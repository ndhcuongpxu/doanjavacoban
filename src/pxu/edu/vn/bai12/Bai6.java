package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Buoc 1: Nhap so phan tu cua mang
		int n= nhapsophantucuamang();
		//Buoc 2: Tao mang so nguyen ngau nhien
		int[] a = taomangngaunhien(n);
		//Buoc 3: Xuat gia tri cua mang ra man hinh
		xuatmangramanhinh(a);
		//Buoc 4: Sap xep mang theo chieu tang dan
		a = sapxeptangdan(a);
		//Buoc 5: Xuat mang ra man hinh
		xuatmangramanhinh(a);
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
	//Ham tao mang so nguyen ngau nhien
	public static int[] taomangngaunhien(int n) {
		int[] a = new int[n];
		for(int i = 0; i < a.length; i++) {
			a[i] = (int)(Math.random()*10);
		}
		return a;
	}
	//Ham xuat gia tri cua mang ra man hinh
	public static void xuatmangramanhinh(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
		System.out.println();
	}
	//Ham sap xep mang theo chieu tang dan
	public static int[] sapxeptangdan(int[] y) {
		for(int i = 0; i < y.length - 1; i++) {
			for(int j = i + 1; j < y.length; j++) {
				if(y[i] > y[j]) {
					int tam = y[i];
					y[i] = y[j];
					y[j] = tam;
				}
			}
		}
		return y;
	}
}
