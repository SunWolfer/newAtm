package com.feicui.com.user;
import java.util.Scanner;

public class QueryMenu extends Virtual{

	public Virtual show(){
		System.out.println("�˻�����"+user.getName());
		System.out.println("�˻����"+user.getBalance());
		System.out.println("1:�������˵�");

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
