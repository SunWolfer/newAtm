package com.feicui.com.user;
import java.util.Scanner;

public class Record extends Virtual{
	public Virtual show(){
		if(user.getDrawdate()==null&&user.getOperationdate()==null&&user.getTransferdate()==null){
			System.out.println("���޽�����Ϣ");
		}else{
			System.out.println(user.getSb());			  
		}
		System.out.println("1.�������˵�");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num==1){
			return new MainMenu();
			}
			else{
				return this;
			}

	}
}