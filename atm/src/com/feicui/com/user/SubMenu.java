package com.feicui.com.user;

import java.util.Scanner;

public class SubMenu {

	public void subMenu(){//ȷ�� �������� �������˵�
		System.out.println("1:ȷ��" +"\n"+ "2:��������" +"\n"+ "3:�������˵�"+"\n") ;
	}
	public void otherMessage(User user,double money){//������Ϣ

		System.out.println("������"+user.getName()+"\n"+"���п���"+user.getAccount()+"\n"+"ת�˽��"+money+"\n") ;
	}
	public void subMenu1(){
		System.out.println("�����ɹ�");
	}
	public void othersbu(){
		System.out.println("1:ȷ��ת��" +"\n"+ "2:������һ��" +"\n"+ "3:�˿�"+"\n") ;
	}
}

