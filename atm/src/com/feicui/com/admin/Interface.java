package com.feicui.com.admin;
import com.feicui.com.user.*;
import java.util.Scanner;

public class Interface {
	public void Interface() {
		Scanner sc = new Scanner(System.in);
		System.out.println("1:����Ա��¼"+"\n"+"2:��ͨ�û���¼"+"\n");
		String str1 = sc.nextLine();
		if(str1.equals("1")) {
			AdmainRegister admainRegister = new AdmainRegister();
			admainRegister.AdminRegister();
		}
		if(str1.equals("2")) {
			Virtual login = new Login();
			while(true){
				login = login.show();

			}
		}
		Interface();
	}
}
