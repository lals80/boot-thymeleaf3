package iducs.springboot.board.util;

import iducs.springboot.board.domain.User;

public class HttpSessionUtils{
	public static boolean isLogined(User user) {
		if(user == null)
			return true;
			else return false;
	}
}