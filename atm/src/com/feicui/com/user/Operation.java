package com.feicui.com.user;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class Operation extends Virtual{

	public Virtual show(){
		Date date = new Date();
		System.out.println("��������Ľ�");
		user.setOpera(new Scanner(System.in).nextDouble());
			SubMenu submenu = new SubMenu();
			submenu.subMenu();
			int input1 = new Scanner(System.in).nextInt();
			if(input1==1){
				atm.OperaBusiness();
				SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy��MM��dd��HHʱmm��ss��"); //���ɹ�ʱ��
				user.setOperationdate(sdf2.format(date));
				user.record(user.getOperationdate(),"���",user.getOpera());
				submenu.subMenu1();
				return new MainMenu();
			}
			if(input1==2){
				return this;
			}
			if(input1==3){
				submenu.subMenu1();
				return new MainMenu();
			}
			return this;
	}
}
