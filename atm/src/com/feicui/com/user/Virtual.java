package com.feicui.com.user;
public abstract class Virtual{
	protected static Atm atm = new Atm();
	protected User user;
	public Virtual(){
		user = atm.getUser();

	}
	public abstract Virtual show();
}
