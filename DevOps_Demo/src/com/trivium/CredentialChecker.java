package com.trivium;

public class CredentialChecker {
	public static boolean checkUser(String username, String password) {
		// Dummy implementation for credential checking
		return "admin".equals(username) && "password".equals(password);
	}
}
