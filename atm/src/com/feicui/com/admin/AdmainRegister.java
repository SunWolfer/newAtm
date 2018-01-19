package com.feicui.com.admin;//¹ÜÀíÔ±µÇÂ¼
import com.feicui.com.user.User;

import java.util.Scanner;

public class AdmainRegister {
	private String adminuser = "370120180104";
	private String adminpassword = "123456";
	public void AdminRegister() {		
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("ÇëÊäÈëÕËºÅ:");

			String Account = sc.nextLine();
			if(adminuser.equals(Account)){
				break;
			}else {
				System.out.println("ÕËºÅ´íÎó");
			}
		}
		while(true){
			System.out.println("ÇëÊäÈëÃÜÂë");
			String Password = sc.nextLine();
			if(adminpassword.equals(Password)){
				break;
			}else {
				System.out.println("ÃÜÂë´íÎó");
			}
		}
		AdminMenu adm = new AdminMenu();
		adm.AdminMenu();
	}
}
