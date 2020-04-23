import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NhaSanXuat {
	private String tenNSX;
	List<May> listMays = new ArrayList<May>();
	private String dicChi;
 	public NhaSanXuat() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	public String getTenNSX() {
		return tenNSX;
	}



	public void setTenNSX(String tenNSX) {
		this.tenNSX = tenNSX;
	}



	public String getDicChi() {
		return dicChi;
	}



	public void setDicChi(String dicChi) {
		this.dicChi = dicChi;
	}



	public void input() {
		Scanner s = new Scanner(System.in);
		System.out.println("Nhập vào tenNSX: ");
		this.tenNSX = s.nextLine();

		System.out.println("Nhập vào dicChi: ");
		this.dicChi = s.nextLine();
		
		System.out.println("Nhập vào số lượng máy: ");
		int numberMay = Integer.valueOf(s.nextLine());
		
		for (int i = 0; i < numberMay; i++) {
			System.out.println("Nhập vào máy thứ: " + (i+ 1)+ ": \n");
			May may = new May();
			may.input();
			may = listMays.get(i);
			listMays.add(may);
		}

	}
	
	public void output() {
		System.out.println("tenNSX: " + this.tenNSX);
		System.out.println("dicChi: " + this.dicChi);
		System.out.println("Nhập vào số lượng máy: ");
		for (int i = 0; i < listMays.size(); i++) {
			
			listMays.get(i).output();
		}
	
	}
}
