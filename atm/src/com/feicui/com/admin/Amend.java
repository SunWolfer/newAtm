package com.feicui.com.admin;

import java.util.Scanner;

import com.feicui.com.user.User;

public class Amend {
	Scanner scanner = new Scanner(System.in);
	UserS userS = new UserS();
	public void amend() {
		System.out.println("������Ҫ�޸ĵ��˻�");
		String str = scanner.nextLine();		
		User user = userS.getUserByAccount(str);
		if(user==null) {
			System.out.println("û�д��ʺ�,����������");
			amend();
		}
		importAccount(user);
		
		userS.amenduser(user);
		submenu(user);
	}

	public void submenu(User user) {
		System.out.println("1:ȷ�ϲ�������һ��");
		System.out.println("2:ȷ�ϲ��������˵�");
		String num = scanner.nextLine();
		if(num.equals("1")) {
			importAccount(user);
		}
		if(num.equals("2")) {
			AdminMenu adminMenu = new AdminMenu();
			adminMenu.AdminMenu();
		}
	}

	public void importAccount(User user) {
		System.out.println(
				"������Ҫ�޸ĵ���Ŀ:" + "\n" + 
						"1:����" + "\n" + 
						"2:����" + "\n" + 
						"3:ѧ��" + "\n" + 
						"4:��ϵ��ַ" + "\n" + 
						"5:�������˵�");
		String str1 = scanner.nextLine();
		if (str1.equals("1")) {
			System.out.println("������Ҫ�޸ĵ�����");
			String str2 = scanner.nextLine();
			user.setName(str2);

		}
		if (str1.equals("2")) {
			System.out.println("������Ҫ�޸ĵ�����");
			String str3 = scanner.nextLine();
			user.setPassword(str3);
		}
		if (str1.equals("3")) {
			System.out.println("������Ҫ�޸ĵ�ѧ��");
			String str4 = scanner.nextLine();
			user.setEducation(str4);
		}
		if (str1.equals("4")) {
			System.out.println("������Ҫ�޸ĵ���ϵ��ַ");
			String str5 = scanner.nextLine();
			user.setAddress(str5);
		}
		if (str1.equals("5")) {
			AdminMenu adminMenu = new AdminMenu();
			adminMenu.AdminMenu();
		}
	}
}
