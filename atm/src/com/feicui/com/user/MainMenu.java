package com.feicui.com.user;
import java.util.Scanner;
import com.feicui.com.admin.*;

public class MainMenu extends Virtual{

	public Virtual show(){
		System.out.println("菜单——选择要办理的业务");
		System.out.println("1:查询");
		System.out.println("2:转账");
		System.out.println("3:取款");
		System.out.println("4:存款");
		System.out.println("5:转账记录");
		System.out.println("6:退卡");

		int num = new Scanner(System.in).nextInt();
		if(num==1){
			return new QueryMenu();
		}
		if(num==2){
			return new Transfer();
		}
		if(num==3){
			return new DrawMoney();
		}
		if(num==4){
			return new Operation();
		}
		if(num==5){
			return new Record();
		}
		if(num==6){
			Interface inter = new Interface();
			inter.Interface();
		}
		return this;
	}
}
