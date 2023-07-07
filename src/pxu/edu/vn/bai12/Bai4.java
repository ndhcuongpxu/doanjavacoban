package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(System.in);
			int n;
			do {
				System.out.print("n = ");
				n = sc.nextInt();
			}while(n <= 0);
			//Tao mang so nguyen a rong co n phan tu
			int[] a = new int[n];
			//Sinh ngau nhien gia tri cac phan tu cho mang a
			for(int i = 0; i < a.length; i++) {
				a[i] = (int)(Math.random()*10);
			}
			//Xuat gia tri cua mang ra man hinh
			for(int value: a) {
				System.out.print(value + " ");
			}
		}catch(Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		}
	}

}
