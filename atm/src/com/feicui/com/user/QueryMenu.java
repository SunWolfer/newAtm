package com.feicui.com.user;
import java.util.Scanner;

public class QueryMenu extends Virtual{

	public Virtual show(){
		System.out.println("账户姓名"+user.getName());
		System.out.println("账户余额"+user.getBalance());
		System.out.println("1:返回主菜单");

		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();

			if(num1==1){
			return new MainMenu();
			}
			else{
				return this;
			}


	}
}
