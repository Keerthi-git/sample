package com.springpeople;

public class EncryptDecrypt {
	public static String Encrypt(String password){
		return password+"*";
	}
	public static String Decrypt(String password){
		return password.substring(0, password.length()-2);
	}
}