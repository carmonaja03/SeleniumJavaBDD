package com.java;

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="test";
		String s2=new String("test");
		String s3="test";
		System.out.println("S "+s);
		System.out.println("S2 "+s2);
		if(s.equals(s3)) {
			System.out.println("equal");
		}
	}

}
