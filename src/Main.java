import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
	static List<MayTinh> listComputers = new ArrayList<MayTinh>();
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		int number;
		do {
			System.out.println("\n\n\t\t1.	Thêm máy tính: ");
			System.out.println("\t\t2.	In ra nhà sản xuất máy tính nSx INter");
			System.out.println("\t\t3.	Sắp xếp máy tính theo chiểu giảm dần theo giá thành");
			System.out.println("\t\t4.	Giá trung bình máy tính");
			System.out.println("\t\t5. Exit");
			System.out.print("\t==> Your choice: ");
			number = Integer.valueOf(sc.nextLine());

			switch (number) {
			case 1:
				add();
				break;

			case 2:
				findNSX();
				break;

			case 3:
				SortComputer();
				break;

			case 4:
				tinhgiaThanh();
				break;

			case 5:
				System.exit(0);
				System.out.println("Exit ^^");
				break;

			default:
				System.out.println("Your choice invalid");
				break;
			}
		} while (true);
	}

	public static void add() {
		System.out.println("Nhập vào số lượng máy tính: ");
		int numberMay = Integer.valueOf(sc.nextLine());

		for (int i = 0; i < numberMay; i++) {
			MayTinh mayT = new MayTinh();
			System.out.print("Nhập vào máy thứ " + (i + 1)+ ": \n");
			
			mayT.input();
			listComputers.add(mayT);
		}
	}

	public static void findNSX() {
		for (int i = 0; i < listComputers.size(); i++) {
			MayTinh nsx = listComputers.get(i);
			if (nsx.getNhaSanXuat().getTenNSX().equals("Inter")) {
				listComputers.get(i).output();
			}
		}
	}

	public static void SortComputer() {
		Collections.sort(listComputers, new Comparator<May>() {

			@Override
			public int compare(May o1, May o2) {
				// TODO Auto-generated method stub
				return -Double.compare(o1.getGiaThanh(), o2.getGiaThanh());
			}
		});

		for (May may : listComputers) {
			may.output();
		}
	}

	public static void tinhgiaThanh() {
		int count = 0;
		double tong = 0;

		for (May may : listComputers) {
			count ++;
			tong += may.getGiaThanh();
		}
		System.out.printf("TB : %3.2f", tong/count);
	}

}
