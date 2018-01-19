package com.feicui.com.admin;//开户
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
			System.out.println("1:确认并返回主菜单;"+"\n"+
								"2:重新输入"+"\n");
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
		System.out.println("请输入客户姓名");
		String str1 = sc.nextLine();
		if(str1.length()<=10) {
			user.setName(str1);
		}else {
			System.out.println("用户姓名不能超过10位");
			importName();
		}
	}
	
	public void importPass() {
		System.out.println("请输入客户密码");
		String str2 = sc.nextLine();				
		if(checkAccount(str2)) {
			user.setPassword(str2);
		}else {
			System.out.println("密码 至少8位,数字和字母必须同时又,至少一个大写字母");
			importPass();
		}
	}
	
	public void importGender() {
		System.out.println("请输入客户性别");
		System.out.println("请务必确认正确,之后不可修改(1代表男 2代表女)");
		String str3 = sc.nextLine();
		if(str3.equals("1")) {
			user.setGender(str3);
		}else if(str3.equals("2")) {
			user.setGender(str3);
		}else {
			System.out.println("请输入1或2");
			importGender();
		}
	}
	
	public void importId() {
		System.out.println("请输入客户的身份证");
		System.out.println("请务必确认正确,之后不可修改");
		String str4 = sc.nextLine();
		if(checkId(str4)) {
			user.setId(str4);
		}else {
			System.out.println("居民身份证必须为18位数字");
			importId();
		}
	}
	
	public void importEdu() {
		System.out.println("请输入客户学历");
		System.out.println("1代表  小学  2代表 中学  3代表大学 4代表其他");
		String str5 = sc.nextLine();
		user.setEducation(str5);
	}
	
	public void importAddress() {
		System.out.println("请输入客户地址");
		String str6 = sc.nextLine();
		user.setAddress(str6);
	}
	
	public void importDate() {
		Date date = new Date();
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMddHHmmssSSS");//设置日期格式
		String str = df.format(date);
		user.setAccount("370"+user.getGender()+str);		
		
	}
	
	private static boolean checkAccount(String str2) {
		return str2.matches("[a-z0-9A-Z]{8,18}") && 
				!str2.matches("[a-zA-Z]+")&& //不能只包含字母 
				!str2.matches("[0-9]+")&& // 不能只包含数字
				!str2.matches("[a-z]+");//至少有一个大写
		}

	private static boolean checkId(String str4) {
		return str4.matches("[a-z0-9A-Z]{18}") && 
				str4.matches("[0-9]+");// 只包含数字
		}

}

