package com.feicui.com.admin;//�쳣����

public class ExceptionUtil {
	public static void printException(Exception e) {
		System.out.println(e.getMessage());
		for(StackTraceElement item : e.getStackTrace()) {
			System.out.println(item);
		}
	}
}
