import java.util.Scanner;

public class May {
	private String nhanDan;
	private NhaSanXuat nhaSanXuat = new NhaSanXuat();
	private double giaThanh;

	public May() {

	}

	public String getNhanDan() {
		return nhanDan;
	}

	public void setNhanDan(String nhanDan) throws Exception {
		if (nhanDan.equals(""))
			throw new Exception("String not empty!!!");
		else
			this.nhanDan = nhanDan;
	}

	public double getGiaThanh() {
		return giaThanh;
	}

	public void setGiaThanh(double giaThanh) {
		this.giaThanh = giaThanh;
	}

	public NhaSanXuat getNhaSanXuat() {
		return nhaSanXuat;
	}

	public void setNhaSanXuat(NhaSanXuat nhaSanXuat) {
		this.nhaSanXuat = nhaSanXuat;
	}

	public void input() {
	
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập vào nhanDan: ");
		this.nhanDan = s.nextLine();

		System.out.println("****************");
		System.out.println("NHẬP VÀO NSX    ");
		System.out.println("****************");

		nhaSanXuat.input();
		
		System.out.println("Nhập vào giaThanh: ");
		this.giaThanh = Double.parseDouble(s.nextLine());

	}


	public void output() {
		System.out.println("Nhãn gián: " + this.nhanDan);
		nhaSanXuat.output();

		System.out.println("Giá thành: " + this.giaThanh);
	}

}
