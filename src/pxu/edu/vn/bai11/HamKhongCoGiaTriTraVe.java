package pxu.edu.vn.bai11;

public class HamKhongCoGiaTriTraVe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		hienthi();
//		hienthi10lan();
		hienthithongdiep("JAVA CO BAN RAT DE");
		hienthithongdiep("HOC LAP TRINH KHONG KHO");
		hienthithongdiep("HOC KY SUMMER RAT NONG");
	}

	public static void hienthi() {
		System.out.println("*********************************");
		System.out.println("\tJAVA CO BAN");
		System.out.println("*********************************");
	}
	
	public static void hienthi10lan() {
		for(int i = 0; i < 10; i++) {
			hienthi();
		}
	}
	
	public static void hienthithongdiep(String msg) {
		System.out.println("*********************************");
		System.out.println("\t" + msg);
		System.out.println("*********************************");
	}
}
