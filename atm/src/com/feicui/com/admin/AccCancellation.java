package com.feicui.com.admin;//销户

import java.awt.List;
import java.util.ArrayList;
import java.util.Scanner;
import com.feicui.com.user.User;

public class AccCancellation {
	Scanner scanner = new Scanner(System.in);
	public void accCancellation() {
		System.out.println("请输入要删除客户的卡号");
		String str1 = scanner.nextLine();		
		UserS userS = new UserS();
		ArrayList<User> list = userS.UserI();
		User user= new User(str1, null, null);
		boolean bo1 = list.contains(user);
		if(!bo1) {
			System.out.println("帐号不存在,请重新输入");
			accCancellation();
		}
		System.out.println("请输入要删除客户的身份证号");
		String str2 = scanner.nextLine();
		boolean bo2 = list.get(list.indexOf(user)).getId().equals(str2);
		if(!bo2) {
			System.out.println("身份证错误，请重新输入");
			accCancellation();
		}if(bo1&&bo2) {
			System.out.println("1:确认"+"\n"+"2:重新输入"+"\n");
			String str3 = scanner.nextLine();
			if(str3.equals("1")) {
				userS.deleteuser(user);	
				AdminMenu adminMenu = new AdminMenu();
				adminMenu.AdminMenu();
			}if(str3.equals("2")) {
				accCancellation();
			}
			
		}
		
	}
}
