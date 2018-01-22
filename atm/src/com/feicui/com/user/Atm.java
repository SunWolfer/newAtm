package com.feicui.com.user;

import java.util.ArrayList;
import com.feicui.com.admin.*;

public class Atm{
	UserS userS = new UserS();
	ArrayList<User> list = userS.UserI();
	private User user;
	public User getUser(){
		return user;
	}
	public void DrawBusiness(){

		user.setBalance(user.getBalance()-user.getDraw());
		userS.amenduser(user);
	}
	public void OperaBusiness(){
		user.setBalance(user.getBalance()+user.getOpera());
		userS.amenduser(user);
	}
	public void OtherBusiness(User otheruser){
		user.setBalance(user.getBalance()-user.getOthermoney());
		otheruser.setBalance(otheruser.getBalance()+user.getOthermoney());
		userS.amenduser(user);
		userS.amenduser(otheruser);
	}
	public User Finduser(User user){//—È÷§’Àªß
		if(list.contains(user)) {
			return list.get(list.indexOf(user));
		}
				
		return null;
	}
	
	public boolean Login(User user){
		User result = Finduser(user);
		if(result==null){
			return false;
		}else{
			if(result.getPassword().equals(user.getPassword())){
				this.user = result;
				return true;
			}
		}
		return false;
	}
}
