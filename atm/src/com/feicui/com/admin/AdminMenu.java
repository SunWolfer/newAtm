package com.feicui.com.admin;//主菜单
import com.feicui.com.user.User;

import java.util.Scanner;

public class AdminMenu {
	Scanner sc = new Scanner(System.in);
	public void AdminMenu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1:开户"+"\n"+
							"2:销户"+"\n"+
							"3:查询客户信息"+"\n"+
							"4:修改客户信息"+"\n"+
							"5:退出"+"\n");
		String str = scanner.nextLine();
		if(str.equals("1")) {
			Atm atm = new Atm();
			atm.atmUser();			
		}
		if(str.equals("2")) {
			AccCancellation accCancellation = new AccCancellation();
			accCancellation.accCancellation();
		}
		if(str.equals("3")) {
			UserS userS = new UserS();
			Object object = userS.UserI();
			System.out.println(object);	
			System.out.println("1:确认并返回主菜单;"+"\n");
			String num = sc.nextLine();
			if(num.equals("1")) {					
				AdminMenu();
			}
		}
		if(str.equals("4")) {

		}
		if(str.equals("5")) {
			Interface interface1 = new Interface();
			interface1.Interface();
		}
	}
}
