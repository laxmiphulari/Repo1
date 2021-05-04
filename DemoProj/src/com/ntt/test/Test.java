package com.ntt.test;

import com.ntt.comp.Utility;

public class Test {

	public static void main(String[] args) {

		Utility u = new Utility();
		System.out.println(u.getSysDate());
	}
	
	public void m1() {

		System.out.println("Test.m1() - 123ABC");
	}
	public void m3() {
		System.out.println("Test.m3()");
	}
}
