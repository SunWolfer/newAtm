package com.feicui.com.user;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;

public class DrawMoney extends Virtual{

	public Virtual show(){
		Date date = new Date();
		
		System.out.println("请输入取款的金额：");
		user.setDraw(new Scanner(System.in).nextDouble());

		if(user.getDraw()<=user.getBalance()){
			SubMenu submenu = new SubMenu();
			submenu.subMenu();
			int input = new Scanner(System.in).nextInt();
			if(input==1){
				atm.DrawBusiness();
				SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒");//取款成功时间
				user.setDrawdate(sdf1.format(date));
				submenu.subMenu1();
				user.record(user.getDrawdate(),"取款",user.getDraw());
				return new MainMenu();
			}
			else if(input==2){
				return this;
			}
			else if(input==3){
				return new MainMenu();
			}
			else{
				return this;
			}
		}else{
			System.out.println("余额不足，请重新输入");
			return this;
		}

	}
}
