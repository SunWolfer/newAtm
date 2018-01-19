package com.feicui.com.admin;//����
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import com.feicui.com.user.User;

public class Atm {
	User user = new User(null, null, 0, null, null, null, null, null);
	Scanner sc = new Scanner(System.in);
	public void atmUser() {
			importName();
			importPass();
			importGender();
			importId();	
			importEdu();
			importAddress();
			importDate();			
			System.out.println(user.toString());
			System.out.println("1:ȷ�ϲ��������˵�;"+"\n"+
								"2:��������"+"\n");
			String str = sc.nextLine();
			if(str.equals("1")) {
				UserS userS = new UserS();
				Object object = userS.UserI();
				System.out.println(object);
				userS.addUser(user);
				AdminMenu adminMenu = new AdminMenu();
				adminMenu.AdminMenu();
			}else {
				atmUser();
			}
			
	}
	
	public void importName() {
		System.out.println("������ͻ�����");
		String str1 = sc.nextLine();
		if(str1.length()<=10) {
			user.setName(str1);
		}else {
			System.out.println("�û��������ܳ���10λ");
			importName();
		}
	}
	
	public void importPass() {
		System.out.println("������ͻ�����");
		String str2 = sc.nextLine();				
		if(checkAccount(str2)) {
			user.setPassword(str2);
		}else {
			System.out.println("���� ����8λ,���ֺ���ĸ����ͬʱ��,����һ����д��ĸ");
			importPass();
		}
	}
	
	public void importGender() {
		System.out.println("������ͻ��Ա�");
		System.out.println("�����ȷ����ȷ,֮�󲻿��޸�(1������ 2����Ů)");
		String str3 = sc.nextLine();
		if(str3.equals("1")) {
			user.setGender(str3);
		}else if(str3.equals("2")) {
			user.setGender(str3);
		}else {
			System.out.println("������1��2");
			importGender();
		}
	}
	
	public void importId() {
		System.out.println("������ͻ������֤");
		System.out.println("�����ȷ����ȷ,֮�󲻿��޸�");
		String str4 = sc.nextLine();
		if(checkId(str4)) {
			user.setId(str4);
		}else {
			System.out.println("�������֤����Ϊ18λ����");
			importId();
		}
	}
	
	public void importEdu() {
		System.out.println("������ͻ�ѧ��");
		System.out.println("1����  Сѧ  2���� ��ѧ  3�����ѧ 4��������");
		String str5 = sc.nextLine();
		user.setEducation(str5);
	}
	
	public void importAddress() {
		System.out.println("������ͻ���ַ");
		String str6 = sc.nextLine();
		user.setAddress(str6);
	}
	
	public void importDate() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");//�������ڸ�ʽ
		String str = df.format(date);
		user.setAccount("370"+user.getGender()+str);		
		
	}
	
	private static boolean checkAccount(String str2) {
		return str2.matches("[a-z0-9A-Z]{8,18}") && 
				!str2.matches("[a-zA-Z]+")&& //����ֻ������ĸ 
				!str2.matches("[0-9]+")&& // ����ֻ��������
				!str2.matches("[a-z]+");//������һ����д
		}

	private static boolean checkId(String str4) {
		return str4.matches("[a-z0-9A-Z]{18}") && 
				str4.matches("[0-9]+");// ֻ��������
		}

}

