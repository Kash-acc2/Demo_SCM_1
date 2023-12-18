package com.acc.lkm.StackFlowDemo;

public class StackOverFlowErrorDemo {
	public static int Stackoverflowmethod(int b) {
		System.out.println(b);
		return b + Stackoverflowmethod(b+2);
	}
	public static void main(String[] args) {
		Stackoverflowmethod(1);
	}	
}
