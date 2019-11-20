package com.strings;

import java.security.*;

public class EncryptDecrypt {
	// given a string encrypt and decrypt it
	public static void main(String[] args) {
		String str = "myPassword";
		int key = 2;
		String encrypted = doEncryption(str, key);
		System.out.println("Encrypted form of " + str + " is : " + encrypted);
		String decrypted = doDecryption(encrypted, key);
		System.out.println("decrypted form of " + encrypted + " is : " + decrypted);
	}

	private static String doDecryption(String encrypted, int key) {
		StringBuilder sb = new StringBuilder();
		for (char ch : encrypted.toCharArray()) {
			ch -= key;
			sb.append(ch);
		}
		return sb.toString();
	}

	private static String doEncryption(String str, int i) {
		StringBuilder sb = new StringBuilder();
		for (char ch : str.toCharArray()) {
			ch += i;
			sb.append(ch);
		}
		return sb.toString();
	}

}
