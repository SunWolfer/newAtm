package com.feicui.com.user;
import java.util.Scanner;
import com.feicui.com.admin.*;

public class MainMenu extends Virtual{

	public Virtual show(){
		System.out.println("�˵�����ѡ��Ҫ�����ҵ��");
		System.out.println("1:��ѯ");
		System.out.println("2:ת��");
		System.out.println("3:ȡ��");
		System.out.println("4:���");
		System.out.println("5:ת�˼�¼");
		System.out.println("6:�˿�");

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
