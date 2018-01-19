package com.feicui.com.user;
import java.util.Scanner;

public class Login extends Virtual{


	public Virtual show(){
		Scanner sc = new Scanner(System.in);
			System.out.println("ÇëÊäÈëÕËºÅ:");
			String Account = sc.nextLine();
			User user = new User(Account,null,Account);
			if(atm.Finduser(user)==null){
				System.out.println("ÓÃ»§²»´æÔÚ");
				return new Login();
			}

			System.out.println("ÇëÊäÈëÃÜÂë");
			String Password = sc.nextLine();
			user.setPassword(Password);
			if(!atm.Login(user)){
				System.out.println("ÃÜÂë´íÎó");
				return new Login();
			}

			return new MainMenu();
	}
}
