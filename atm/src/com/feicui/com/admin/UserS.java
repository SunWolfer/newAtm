package com.feicui.com.admin;//生成文件并存储
import com.feicui.com.user.User;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserS {
	private ArrayList<User> list = new ArrayList<>();
	File file = new File("message" + File.separator + "message");
	public UserS() {
		// TODO Auto-generated constructor stub
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public boolean addUser(User user) {
		list = UserI();
		list.add(user);
		FileOutputStream fis = null;
		ObjectOutputStream ois = null;
		try {
			fis = new FileOutputStream(file);
			ois = new ObjectOutputStream(fis);
			ois.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}
	public boolean deleteuser(User user) {
		list = UserI();
		list.remove(user);
		FileOutputStream fis = null;
		ObjectOutputStream ois = null;
		try {
			fis = new FileOutputStream(file);
			ois = new ObjectOutputStream(fis);
			ois.writeObject(list);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return true;
	}
	
	public ArrayList<User> UserI() {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(file);
			ois = new ObjectInputStream(fis);
			return (ArrayList<User>) ois.readObject();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			ExceptionUtil.printException(e);
		}catch(ClassNotFoundException e) {
			ExceptionUtil.printException(e);
		}
		return new ArrayList<>();
	}
}
