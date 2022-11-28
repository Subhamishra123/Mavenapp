package com.nit;

import in.ashokit.PasswordUtils;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String encode = PasswordUtils.encode("veneno");
		System.out.println(encode);
		String decoder = PasswordUtils.decoder(encode);
		System.out.println(decoder);

	}

}
