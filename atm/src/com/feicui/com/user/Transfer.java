package com.feicui.com.user;
import java.util.Scanner;

import com.feicui.com.admin.UserS;

import java.util.Date;
import java.text.SimpleDateFormat;

public class Transfer extends Virtual{

	public Virtual show(){
		Scanner sc = new Scanner(System.in);
		SubMenu submenu = new SubMenu();
		Date date = new Date();
		System.out.println("请输入对方卡号");
		String Account = sc.nextLine();
		User user1 = atm.Finduser(new User(Account,null,null));
		if(user1==null){
				System.out.println("用户不存在");
				return this;
			}
		System.out.println("请输入转账金额");
		user.setOthermoney(Double.valueOf(sc.nextLine()));
		submenu.subMenu();

		String number2 = sc.nextLine();
		if(number2.equals("1")){//转账业务菜单
			submenu.otherMessage(user1,user.getOthermoney());
				submenu.othersbu();
				String number3 = sc.nextLine();
					if(number3.equals("1")){
						if(user.getOthermoney()<=user.getBalance()){
							System.out.println("转账成功!");
							atm.OtherBusiness(user1);
							SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年MM月dd日HH时mm分ss秒"); //转账成功时间
							user.setTransferdate(sdf3.format(date));
							user.record(user.getTransferdate(),"转账给"+Account,user.getOthermoney());
							
							submenu.subMenu1();
							return new MainMenu();
						}else{
							System.out.println("余额不足，请重新输入：");
							return this;
							}
						}
						if(number3.equals("2")){
							return this;
							}
						if(number3.equals("3")){
							return new Login();
						}
					}
			if(number2.equals("2")){
				return this;
				}
			if(number2.equals("3")){
				return new MainMenu();
				}
				return this;
    }
}
