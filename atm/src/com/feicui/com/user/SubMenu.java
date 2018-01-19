package com.feicui.com.user;

import java.util.Scanner;

public class SubMenu {

	public void subMenu(){//确认 重新输入 返回主菜单
		System.out.println("1:确认" +"\n"+ "2:重新输入" +"\n"+ "3:返回主菜单"+"\n") ;
	}
	public void otherMessage(User user,double money){//她人信息

		System.out.println("姓名："+user.getName()+"\n"+"银行卡号"+user.getAccount()+"\n"+"转账金额"+money+"\n") ;
	}
	public void subMenu1(){
		System.out.println("操作成功");
	}
	public void othersbu(){
		System.out.println("1:确认转账" +"\n"+ "2:返回上一级" +"\n"+ "3:退卡"+"\n") ;
	}
}

