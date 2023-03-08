package main;

import java.security.MessageDigest;

public class Test {
	public static void main(String[] args) throws Exception{
		// 단방향 암호화 SHA 연습
		System.out.println(sha512("10"));
		System.out.println(sha512("10"));

	}

	public static String sha512(String msg) throws Exception{

		MessageDigest md = MessageDigest.getInstance("SHA-512");
		md.update(msg.getBytes());
		StringBuilder builder = new StringBuilder();
		for (byte b : md.digest()) {
			builder.append(String.format("%02x", b));
		}
		return builder.toString();
	}
}
