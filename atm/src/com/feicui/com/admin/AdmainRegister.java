package com.feicui.com.admin;//����Ա��¼
import com.feicui.com.user.User;

import java.util.Scanner;

public class AdmainRegister {
	private String adminuser = "370120180104";
	private String adminpassword = "123456";
	public void AdminRegister() {		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("�������˺�:");

			String Account = sc.nextLine();
			if(adminuser.equals(Account)){
				break;
			}else {
				System.out.println("�˺Ŵ���");
			}
		}
		while(true){
			System.out.println("����������");
			String Password = sc.nextLine();
			if(adminpassword.equals(Password)){
				break;
			}else {
				System.out.println("�������");
			}
		}
		AdminMenu adm = new AdminMenu();
		adm.AdminMenu();
	}
}
