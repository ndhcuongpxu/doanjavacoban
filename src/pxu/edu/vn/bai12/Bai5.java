package pxu.edu.vn.bai12;

import java.util.Scanner;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//Nhap n nguyen duong tu ban phim
			Scanner sc = new Scanner(System.in);
			int n;
			do {
				System.out.print("n = ");
				n = sc.nextInt();
			}while(n <= 0);
			
		}catch(Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		}
	}

}